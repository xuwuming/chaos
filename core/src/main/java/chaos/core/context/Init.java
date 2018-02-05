package chaos.core.context;

import chaos.api.ApiHelper;
import chaos.core.commons.ExceptionUtils_;
import chaos.core.commons.KaptchaUtils_;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by chaos on 2018/1/16.
 * 作者：王健
 * qq:1413221142
 */
@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {
    private final static Logger log = LoggerFactory.getLogger(Init.class);

    public ApplicationContext appContext;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        appContext = event.getApplicationContext();
        try {
            ExceptionUtils_.init(appContext);
            KaptchaUtils_.init(appContext);
            ApiHelper.getInstance().init(appContext);
        } catch (Exception e) {
            log.warn("初始化异常！", e);
        }
    }
}

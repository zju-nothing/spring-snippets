package com.nothing.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;


/**
 * @author chenliu, create at 11/11/14 14:38
 */
@Controller
public class InspectAppContextController implements ApplicationContextAware {
    private final static Logger logger = LoggerFactory.getLogger(InspectAppContextController.class);

    private ApplicationContext applicationContext;

    @RequestMapping("/inspect.html")
    public ModelAndView inspectContext(HttpServletRequest request) {
        String contextName = applicationContext.getDisplayName();
        String contextId = applicationContext.getId();
        List<String> beans = Arrays.asList(applicationContext.getBeanDefinitionNames());
        BeanFactory parentBeanFactory = applicationContext.getParentBeanFactory();
        ApplicationContext parentApplication = applicationContext.getParent();

        request.setAttribute("contextName",contextName);
        request.setAttribute("contextId",contextId);
        request.setAttribute("beans",beans);
        request.setAttribute("parentBeanFactory",parentBeanFactory);
        request.setAttribute("parentApplication",parentApplication);


        logger.info("==========Current Container==========");
        logger.info("displayName ==> " + contextName);
        logger.info("applicationId ==> " + contextId);
        logger.info("beans ==> " + beans);
        logger.info("parentBeanFactory ==> " + parentBeanFactory);
        logger.info("parentApplication ==> " + parentApplication);


        if (parentApplication != null) {
            String pcontextName = parentApplication.getDisplayName();
            String pcontextId = parentApplication.getId();
            List<String> pbeans = Arrays.asList(parentApplication.getBeanDefinitionNames());
            BeanFactory ppBeanFactory= parentApplication.getParentBeanFactory();
            ApplicationContext pparentApplication = parentApplication.getParent();

            request.setAttribute("pcontextName",pcontextName);
            request.setAttribute("pcontextId",pcontextId);
            request.setAttribute("pbeans",pbeans);
            request.setAttribute("pparentBeanFactory",ppBeanFactory);
            request.setAttribute("pparentApplication",pparentApplication);



            logger.info("==========Parent Container===========");
            logger.info("displayName ==> " + pcontextName);
            logger.info("applicationId ==> " + pcontextId);
            logger.info("beans ==> " + pbeans);
            logger.info("parentBeanFactory ==> " + ppBeanFactory);
            logger.info("parentApplication ==> " + pparentApplication);
        }

        request.setAttribute("context",applicationContext);
        return new ModelAndView("inspectContext");

    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

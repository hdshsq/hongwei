package cn.song.hongwei.sys.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: hongwei
 * @description: 日志记录类
 * @author: Mr.Song
 * @create: 2020-10-14 14:40
 **/
@Component
public class Log {
    private static Logger logger = LoggerFactory.getLogger(Log.class);


    /**
     *
     * @param logLevel 日志登记 1-5之间
     * @param message
     */
    public static void recodeInfo(int logLevel,String message){

        switch (logLevel){
            case 1:
                logger.trace(message);
                return;
            case 2:
                logger.debug(message);
                return;
            case 3:
                logger.info(message);
                return;
            case 4:
                logger.warn(message);
                return;
            case 5:
                logger.error(message);
                return;
            default:
                throw new RuntimeException("日志登记在1到5之间");


        }
    }




}

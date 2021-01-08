package cn.song.hongwei.sys.services.ex;

/**
 * @program: hongwei
 * @description: 添加数据失败时的异常
 * @author: Mr.Song
 * @create: 2020-10-15 17:27
 **/
public class InsertException extends RuntimeException{
    
    public InsertException() {
        super();
    }

    public InsertException(String message) {
        super(message);
    }

    public InsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsertException(Throwable cause) {
        super(cause);
    }

    protected InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

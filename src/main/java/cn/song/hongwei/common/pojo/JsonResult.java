package cn.song.hongwei.common.pojo;

/**
 * @program: hongwei
 * @description: 返回的JSON数据
 * @author: Mr.Song
 * @create: 2020-10-19 11:30
 **/
public class JsonResult<T> {

    private Integer state;
    private String message;
    private T data;

    public JsonResult(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public JsonResult(Integer state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

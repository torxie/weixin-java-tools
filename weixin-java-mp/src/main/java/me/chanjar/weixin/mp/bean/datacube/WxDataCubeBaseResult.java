package me.chanjar.weixin.mp.bean.datacube;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * <pre>
 *  统计接口的共用属性类.
 *  Created by Binary Wang on 2016/8/25.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
public abstract class WxDataCubeBaseResult implements Serializable {
  private static final long serialVersionUID = 8780389911053297600L;
  protected static final JsonParser JSON_PARSER = new JsonParser();

  /**
   * ref_date.
   * 数据的日期，需在begin_date和end_date之间
   */
  @SerializedName("ref_date")
  private String refDate;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }

}

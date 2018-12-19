/*
 * Gamification Engine API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.smartcommunitylab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * LevelDTO
 */

public class LevelDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("pointConcept")
  private String pointConcept = null;

  @SerializedName("thresholds")
  private List<ThresholdDTO> thresholds = null;

  public LevelDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LevelDTO pointConcept(String pointConcept) {
    this.pointConcept = pointConcept;
    return this;
  }

   /**
   * Get pointConcept
   * @return pointConcept
  **/
  @ApiModelProperty(value = "")
  public String getPointConcept() {
    return pointConcept;
  }

  public void setPointConcept(String pointConcept) {
    this.pointConcept = pointConcept;
  }

  public LevelDTO thresholds(List<ThresholdDTO> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public LevelDTO addThresholdsItem(ThresholdDTO thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<ThresholdDTO>();
    }
    this.thresholds.add(thresholdsItem);
    return this;
  }

   /**
   * Get thresholds
   * @return thresholds
  **/
  @ApiModelProperty(value = "")
  public List<ThresholdDTO> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<ThresholdDTO> thresholds) {
    this.thresholds = thresholds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LevelDTO levelDTO = (LevelDTO) o;
    return Objects.equals(this.name, levelDTO.name) &&
        Objects.equals(this.pointConcept, levelDTO.pointConcept) &&
        Objects.equals(this.thresholds, levelDTO.thresholds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pointConcept, thresholds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LevelDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pointConcept: ").append(toIndentedString(pointConcept)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


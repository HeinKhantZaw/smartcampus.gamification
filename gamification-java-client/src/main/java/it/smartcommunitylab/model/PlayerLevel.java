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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PlayerLevel
 */

public class PlayerLevel {
  @SerializedName("endLevelScore")
  private Double endLevelScore = null;

  @SerializedName("levelIndex")
  private Integer levelIndex = null;

  @SerializedName("levelName")
  private String levelName = null;

  @SerializedName("levelValue")
  private String levelValue = null;

  @SerializedName("pointConcept")
  private String pointConcept = null;

  @SerializedName("startLevelScore")
  private Double startLevelScore = null;

  @SerializedName("toNextLevel")
  private Double toNextLevel = null;

  public PlayerLevel endLevelScore(Double endLevelScore) {
    this.endLevelScore = endLevelScore;
    return this;
  }

   /**
   * Get endLevelScore
   * @return endLevelScore
  **/
  @ApiModelProperty(value = "")
  public Double getEndLevelScore() {
    return endLevelScore;
  }

  public void setEndLevelScore(Double endLevelScore) {
    this.endLevelScore = endLevelScore;
  }

  public PlayerLevel levelIndex(Integer levelIndex) {
    this.levelIndex = levelIndex;
    return this;
  }

   /**
   * Get levelIndex
   * @return levelIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getLevelIndex() {
    return levelIndex;
  }

  public void setLevelIndex(Integer levelIndex) {
    this.levelIndex = levelIndex;
  }

  public PlayerLevel levelName(String levelName) {
    this.levelName = levelName;
    return this;
  }

   /**
   * Get levelName
   * @return levelName
  **/
  @ApiModelProperty(value = "")
  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }

  public PlayerLevel levelValue(String levelValue) {
    this.levelValue = levelValue;
    return this;
  }

   /**
   * Get levelValue
   * @return levelValue
  **/
  @ApiModelProperty(value = "")
  public String getLevelValue() {
    return levelValue;
  }

  public void setLevelValue(String levelValue) {
    this.levelValue = levelValue;
  }

  public PlayerLevel pointConcept(String pointConcept) {
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

  public PlayerLevel startLevelScore(Double startLevelScore) {
    this.startLevelScore = startLevelScore;
    return this;
  }

   /**
   * Get startLevelScore
   * @return startLevelScore
  **/
  @ApiModelProperty(value = "")
  public Double getStartLevelScore() {
    return startLevelScore;
  }

  public void setStartLevelScore(Double startLevelScore) {
    this.startLevelScore = startLevelScore;
  }

  public PlayerLevel toNextLevel(Double toNextLevel) {
    this.toNextLevel = toNextLevel;
    return this;
  }

   /**
   * Get toNextLevel
   * @return toNextLevel
  **/
  @ApiModelProperty(value = "")
  public Double getToNextLevel() {
    return toNextLevel;
  }

  public void setToNextLevel(Double toNextLevel) {
    this.toNextLevel = toNextLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerLevel playerLevel = (PlayerLevel) o;
    return Objects.equals(this.endLevelScore, playerLevel.endLevelScore) &&
        Objects.equals(this.levelIndex, playerLevel.levelIndex) &&
        Objects.equals(this.levelName, playerLevel.levelName) &&
        Objects.equals(this.levelValue, playerLevel.levelValue) &&
        Objects.equals(this.pointConcept, playerLevel.pointConcept) &&
        Objects.equals(this.startLevelScore, playerLevel.startLevelScore) &&
        Objects.equals(this.toNextLevel, playerLevel.toNextLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endLevelScore, levelIndex, levelName, levelValue, pointConcept, startLevelScore, toNextLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerLevel {\n");
    
    sb.append("    endLevelScore: ").append(toIndentedString(endLevelScore)).append("\n");
    sb.append("    levelIndex: ").append(toIndentedString(levelIndex)).append("\n");
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    levelValue: ").append(toIndentedString(levelValue)).append("\n");
    sb.append("    pointConcept: ").append(toIndentedString(pointConcept)).append("\n");
    sb.append("    startLevelScore: ").append(toIndentedString(startLevelScore)).append("\n");
    sb.append("    toNextLevel: ").append(toIndentedString(toNextLevel)).append("\n");
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


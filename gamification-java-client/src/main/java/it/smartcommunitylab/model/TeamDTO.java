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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * TeamDTO
 */

public class TeamDTO {
  @SerializedName("customData")
  private Map<String, Object> customData = null;

  @SerializedName("gameId")
  private String gameId = null;

  @SerializedName("inventory")
  private Inventory inventory = null;

  @SerializedName("levels")
  private List<PlayerLevel> levels = null;

  @SerializedName("members")
  private List<String> members = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("playerId")
  private String playerId = null;

  @SerializedName("state")
  private Map<String, java.util.Set<GameConcept>> state = null;

  public TeamDTO customData(Map<String, Object> customData) {
    this.customData = customData;
    return this;
  }

  public TeamDTO putCustomDataItem(String key, Object customDataItem) {
    if (this.customData == null) {
      this.customData = new HashMap<String, Object>();
    }
    this.customData.put(key, customDataItem);
    return this;
  }

   /**
   * Get customData
   * @return customData
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getCustomData() {
    return customData;
  }

  public void setCustomData(Map<String, Object> customData) {
    this.customData = customData;
  }

  public TeamDTO gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  @ApiModelProperty(value = "")
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public TeamDTO inventory(Inventory inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @ApiModelProperty(value = "")
  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public TeamDTO levels(List<PlayerLevel> levels) {
    this.levels = levels;
    return this;
  }

  public TeamDTO addLevelsItem(PlayerLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<PlayerLevel>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @ApiModelProperty(value = "")
  public List<PlayerLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<PlayerLevel> levels) {
    this.levels = levels;
  }

  public TeamDTO members(List<String> members) {
    this.members = members;
    return this;
  }

  public TeamDTO addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<String>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(value = "")
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public TeamDTO name(String name) {
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

  public TeamDTO playerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @ApiModelProperty(value = "")
  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public TeamDTO state(Map<String, java.util.Set<GameConcept>> state) {
    this.state = state;
    return this;
  }

  public TeamDTO putStateItem(String key, java.util.Set<GameConcept> stateItem) {
    if (this.state == null) {
      this.state = new HashMap<String, java.util.Set<GameConcept>>();
    }
    this.state.put(key, stateItem);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public Map<String, java.util.Set<GameConcept>> getState() {
    return state;
  }

  public void setState(Map<String, java.util.Set<GameConcept>> state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamDTO teamDTO = (TeamDTO) o;
    return Objects.equals(this.customData, teamDTO.customData) &&
        Objects.equals(this.gameId, teamDTO.gameId) &&
        Objects.equals(this.inventory, teamDTO.inventory) &&
        Objects.equals(this.levels, teamDTO.levels) &&
        Objects.equals(this.members, teamDTO.members) &&
        Objects.equals(this.name, teamDTO.name) &&
        Objects.equals(this.playerId, teamDTO.playerId) &&
        Objects.equals(this.state, teamDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customData, gameId, inventory, levels, members, name, playerId, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamDTO {\n");
    
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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


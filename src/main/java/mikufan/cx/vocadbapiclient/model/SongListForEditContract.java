/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package mikufan.cx.vocadbapiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryThumbContract;
import mikufan.cx.vocadbapiclient.model.SongInListEditContract;
import mikufan.cx.vocadbapiclient.model.SongListFeaturedCategory;
import mikufan.cx.vocadbapiclient.model.UserForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SongListForEditContract
 */
@JsonPropertyOrder({
  SongListForEditContract.JSON_PROPERTY_SONG_LINKS,
  SongListForEditContract.JSON_PROPERTY_UPDATE_NOTES,
  SongListForEditContract.JSON_PROPERTY_AUTHOR,
  SongListForEditContract.JSON_PROPERTY_CAN_EDIT,
  SongListForEditContract.JSON_PROPERTY_DELETED,
  SongListForEditContract.JSON_PROPERTY_DESCRIPTION,
  SongListForEditContract.JSON_PROPERTY_EVENT_DATE,
  SongListForEditContract.JSON_PROPERTY_STATUS,
  SongListForEditContract.JSON_PROPERTY_THUMB,
  SongListForEditContract.JSON_PROPERTY_VERSION,
  SongListForEditContract.JSON_PROPERTY_FEATURED_CATEGORY,
  SongListForEditContract.JSON_PROPERTY_ID,
  SongListForEditContract.JSON_PROPERTY_NAME
})
@JsonTypeName("SongListForEditContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-23T13:02:48.301797700-04:00[America/New_York]")
public class SongListForEditContract {
  public static final String JSON_PROPERTY_SONG_LINKS = "songLinks";
  private List<SongInListEditContract> songLinks = null;

  public static final String JSON_PROPERTY_UPDATE_NOTES = "updateNotes";
  private String updateNotes;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private UserForApiContract author;

  public static final String JSON_PROPERTY_CAN_EDIT = "canEdit";
  private Boolean canEdit;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private LocalDateTime eventDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_THUMB = "thumb";
  private EntryThumbContract thumb;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_FEATURED_CATEGORY = "featuredCategory";
  private SongListFeaturedCategory featuredCategory;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public SongListForEditContract songLinks(List<SongInListEditContract> songLinks) {
    
    this.songLinks = songLinks;
    return this;
  }

  public SongListForEditContract addSongLinksItem(SongInListEditContract songLinksItem) {
    if (this.songLinks == null) {
      this.songLinks = new ArrayList<>();
    }
    this.songLinks.add(songLinksItem);
    return this;
  }

   /**
   * Get songLinks
   * @return songLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SONG_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongInListEditContract> getSongLinks() {
    return songLinks;
  }


  @JsonProperty(JSON_PROPERTY_SONG_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSongLinks(List<SongInListEditContract> songLinks) {
    this.songLinks = songLinks;
  }


  public SongListForEditContract updateNotes(String updateNotes) {
    
    this.updateNotes = updateNotes;
    return this;
  }

   /**
   * Get updateNotes
   * @return updateNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateNotes() {
    return updateNotes;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateNotes(String updateNotes) {
    this.updateNotes = updateNotes;
  }


  public SongListForEditContract author(UserForApiContract author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserForApiContract getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(UserForApiContract author) {
    this.author = author;
  }


  public SongListForEditContract canEdit(Boolean canEdit) {
    
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Get canEdit
   * @return canEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanEdit() {
    return canEdit;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }


  public SongListForEditContract deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public SongListForEditContract description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public SongListForEditContract eventDate(LocalDateTime eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getEventDate() {
    return eventDate;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventDate(LocalDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public SongListForEditContract status(EntryStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EntryStatus status) {
    this.status = status;
  }


  public SongListForEditContract thumb(EntryThumbContract thumb) {
    
    this.thumb = thumb;
    return this;
  }

   /**
   * Get thumb
   * @return thumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryThumbContract getThumb() {
    return thumb;
  }


  @JsonProperty(JSON_PROPERTY_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumb(EntryThumbContract thumb) {
    this.thumb = thumb;
  }


  public SongListForEditContract version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public SongListForEditContract featuredCategory(SongListFeaturedCategory featuredCategory) {
    
    this.featuredCategory = featuredCategory;
    return this;
  }

   /**
   * Get featuredCategory
   * @return featuredCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEATURED_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongListFeaturedCategory getFeaturedCategory() {
    return featuredCategory;
  }


  @JsonProperty(JSON_PROPERTY_FEATURED_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeaturedCategory(SongListFeaturedCategory featuredCategory) {
    this.featuredCategory = featuredCategory;
  }


  public SongListForEditContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public SongListForEditContract name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongListForEditContract songListForEditContract = (SongListForEditContract) o;
    return Objects.equals(this.songLinks, songListForEditContract.songLinks) &&
        Objects.equals(this.updateNotes, songListForEditContract.updateNotes) &&
        Objects.equals(this.author, songListForEditContract.author) &&
        Objects.equals(this.canEdit, songListForEditContract.canEdit) &&
        Objects.equals(this.deleted, songListForEditContract.deleted) &&
        Objects.equals(this.description, songListForEditContract.description) &&
        Objects.equals(this.eventDate, songListForEditContract.eventDate) &&
        Objects.equals(this.status, songListForEditContract.status) &&
        Objects.equals(this.thumb, songListForEditContract.thumb) &&
        Objects.equals(this.version, songListForEditContract.version) &&
        Objects.equals(this.featuredCategory, songListForEditContract.featuredCategory) &&
        Objects.equals(this.id, songListForEditContract.id) &&
        Objects.equals(this.name, songListForEditContract.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(songLinks, updateNotes, author, canEdit, deleted, description, eventDate, status, thumb, version, featuredCategory, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongListForEditContract {\n");
    sb.append("    songLinks: ").append(toIndentedString(songLinks)).append("\n");
    sb.append("    updateNotes: ").append(toIndentedString(updateNotes)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    featuredCategory: ").append(toIndentedString(featuredCategory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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
import mikufan.cx.vocadbapiclient.model.UserForApiContract;
import mikufan.cx.vocadbapiclient.model.UserInboxType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserMessageContract
 */
@JsonPropertyOrder({
  UserMessageContract.JSON_PROPERTY_BODY,
  UserMessageContract.JSON_PROPERTY_CREATED_FORMATTED,
  UserMessageContract.JSON_PROPERTY_HIGH_PRIORITY,
  UserMessageContract.JSON_PROPERTY_ID,
  UserMessageContract.JSON_PROPERTY_INBOX,
  UserMessageContract.JSON_PROPERTY_READ,
  UserMessageContract.JSON_PROPERTY_RECEIVER,
  UserMessageContract.JSON_PROPERTY_SENDER,
  UserMessageContract.JSON_PROPERTY_SUBJECT
})
@JsonTypeName("UserMessageContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-23T13:02:48.301797700-04:00[America/New_York]")
public class UserMessageContract {
  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_CREATED_FORMATTED = "createdFormatted";
  private String createdFormatted;

  public static final String JSON_PROPERTY_HIGH_PRIORITY = "highPriority";
  private Boolean highPriority;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_INBOX = "inbox";
  private UserInboxType inbox;

  public static final String JSON_PROPERTY_READ = "read";
  private Boolean read;

  public static final String JSON_PROPERTY_RECEIVER = "receiver";
  private UserForApiContract receiver;

  public static final String JSON_PROPERTY_SENDER = "sender";
  private UserForApiContract sender;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;


  public UserMessageContract body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public UserMessageContract createdFormatted(String createdFormatted) {
    
    this.createdFormatted = createdFormatted;
    return this;
  }

   /**
   * Get createdFormatted
   * @return createdFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedFormatted() {
    return createdFormatted;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedFormatted(String createdFormatted) {
    this.createdFormatted = createdFormatted;
  }


  public UserMessageContract highPriority(Boolean highPriority) {
    
    this.highPriority = highPriority;
    return this;
  }

   /**
   * Get highPriority
   * @return highPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHighPriority() {
    return highPriority;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighPriority(Boolean highPriority) {
    this.highPriority = highPriority;
  }


  public UserMessageContract id(Integer id) {
    
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


  public UserMessageContract inbox(UserInboxType inbox) {
    
    this.inbox = inbox;
    return this;
  }

   /**
   * Get inbox
   * @return inbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserInboxType getInbox() {
    return inbox;
  }


  @JsonProperty(JSON_PROPERTY_INBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInbox(UserInboxType inbox) {
    this.inbox = inbox;
  }


  public UserMessageContract read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRead() {
    return read;
  }


  @JsonProperty(JSON_PROPERTY_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRead(Boolean read) {
    this.read = read;
  }


  public UserMessageContract receiver(UserForApiContract receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserForApiContract getReceiver() {
    return receiver;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiver(UserForApiContract receiver) {
    this.receiver = receiver;
  }


  public UserMessageContract sender(UserForApiContract sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserForApiContract getSender() {
    return sender;
  }


  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSender(UserForApiContract sender) {
    this.sender = sender;
  }


  public UserMessageContract subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMessageContract userMessageContract = (UserMessageContract) o;
    return Objects.equals(this.body, userMessageContract.body) &&
        Objects.equals(this.createdFormatted, userMessageContract.createdFormatted) &&
        Objects.equals(this.highPriority, userMessageContract.highPriority) &&
        Objects.equals(this.id, userMessageContract.id) &&
        Objects.equals(this.inbox, userMessageContract.inbox) &&
        Objects.equals(this.read, userMessageContract.read) &&
        Objects.equals(this.receiver, userMessageContract.receiver) &&
        Objects.equals(this.sender, userMessageContract.sender) &&
        Objects.equals(this.subject, userMessageContract.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, createdFormatted, highPriority, id, inbox, read, receiver, sender, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMessageContract {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdFormatted: ").append(toIndentedString(createdFormatted)).append("\n");
    sb.append("    highPriority: ").append(toIndentedString(highPriority)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inbox: ").append(toIndentedString(inbox)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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


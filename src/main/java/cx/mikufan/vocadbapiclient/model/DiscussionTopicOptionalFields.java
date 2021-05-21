// auto fixed by vocadb-apiclient-fixer at 2021-05-21T00:10:28.2291931
/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech),
 * and is auto fixed by VocaDB ApiClient Fixer (https://github.com/CXwudi/openapi-vocadb-java-client-autofixer)
 *
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cx.mikufan.vocadbapiclient.model;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DiscussionTopicOptionalFields
 */
public class DiscussionTopicOptionalFields {

  public enum Constant {

    NONE("None"),

    COMMENTS("Comments"),

    COMMENTCOUNT("CommentCount"),

    CONTENT("Content"),

    LASTCOMMENT("LastComment"),

    ALL("All");

    private String value;

    Constant(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private Set<Constant> enums;

  @JsonCreator
  public static DiscussionTopicOptionalFields fromValue(String value) {
    if (value == null || value.isEmpty()){
      return null;
    }
    return new DiscussionTopicOptionalFields(value);
  }

  public DiscussionTopicOptionalFields(String... constantNames) {
    enums = new HashSet<>();
    if (constantNames == null || constantNames.length == 0) {
      return;
    }
    if (constantNames.length == 1) {
      constantNames = constantNames[0].split(",");
    }

    Map<String, Constant> constantsMapper = new HashMap<>();
    for (Constant t: Constant.values()){
      constantsMapper.put(t.getValue(), t);
    }

    for (String name: constantNames){
      if (name == null || (name = name.trim()).isEmpty()){
        continue;
      }
      if (constantsMapper.containsKey(name)){
        enums.add(constantsMapper.get(name));
      } else {
        throw new IllegalArgumentException("Unexpected value " + name + "");
      }
    }
  }

  public DiscussionTopicOptionalFields(Constant... constants){
    enums = new HashSet<>();
    if (constants == null || constants.length == 0) {
      return;
    }
    for (Constant constant : constants) {
      if (constant != null){
        enums.add(constant);
      }
    }
  }

  @Override @JsonValue
  public String toString() {
    if (enums == null || enums.isEmpty()) {
      return null;
    }
    return enums.stream().map(Constant::getValue).collect(Collectors.joining(","));
  }

  /**
   * @return Set<Constant> return the enums
   */
  public Set<Constant> getEnums() {
      return enums;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enums);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionTopicOptionalFields that = (DiscussionTopicOptionalFields) o;
    return Objects.equals(this.enums, that.enums);
  }

}

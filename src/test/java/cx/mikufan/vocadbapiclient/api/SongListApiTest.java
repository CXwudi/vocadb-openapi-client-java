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


package cx.mikufan.vocadbapiclient.api;

import cx.mikufan.vocadbapiclient.model.AdvancedSearchFilterParams;
import cx.mikufan.vocadbapiclient.model.CommentForApiContract;
import cx.mikufan.vocadbapiclient.model.CommentForApiContractPartialFindResult;
import cx.mikufan.vocadbapiclient.model.ContentLanguagePreference;
import cx.mikufan.vocadbapiclient.model.NameMatchMode;
import cx.mikufan.vocadbapiclient.model.PVServices;
import cx.mikufan.vocadbapiclient.model.SongInListForApiContractPartialFindResult;
import cx.mikufan.vocadbapiclient.model.SongListFeaturedCategory;
import cx.mikufan.vocadbapiclient.model.SongListForApiContractPartialFindResult;
import cx.mikufan.vocadbapiclient.model.SongListForEditContract;
import cx.mikufan.vocadbapiclient.model.SongListOptionalFields;
import cx.mikufan.vocadbapiclient.model.SongListSortRule;
import cx.mikufan.vocadbapiclient.model.SongOptionalFields;
import cx.mikufan.vocadbapiclient.model.SongSortRule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SongListApi
 */
@Ignore
public class SongListApiTest {

    private final SongListApi api = new SongListApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsCommentsCommentIdDeleteTest() {
        Integer commentId = null;
        api.apiSongListsCommentsCommentIdDelete(commentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsCommentsCommentIdPostTest() {
        Integer commentId = null;
        CommentForApiContract commentForApiContract = null;
        api.apiSongListsCommentsCommentIdPost(commentId, commentForApiContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsFeaturedGetTest() {
        String query = null;
        List<Integer> tagId = null;
        Boolean childTags = null;
        NameMatchMode nameMatchMode = null;
        SongListFeaturedCategory featuredCategory = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        SongListSortRule sort = null;
        SongListOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        SongListForApiContractPartialFindResult response = api.apiSongListsFeaturedGet(query, tagId, childTags, nameMatchMode, featuredCategory, start, maxResults, getTotalCount, sort, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsFeaturedNamesGetTest() {
        String query = null;
        NameMatchMode nameMatchMode = null;
        SongListFeaturedCategory featuredCategory = null;
        Integer maxResults = null;
        List<String> response = api.apiSongListsFeaturedNamesGet(query, nameMatchMode, featuredCategory, maxResults);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsIdDeleteTest() {
        Integer id = null;
        String notes = null;
        Boolean hardDelete = null;
        api.apiSongListsIdDelete(id, notes, hardDelete);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsListIdCommentsGetTest() {
        Integer listId = null;
        CommentForApiContractPartialFindResult response = api.apiSongListsListIdCommentsGet(listId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsListIdCommentsPostTest() {
        Integer listId = null;
        CommentForApiContract commentForApiContract = null;
        CommentForApiContract response = api.apiSongListsListIdCommentsPost(listId, commentForApiContract);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsListIdSongsGetTest() {
        Integer listId = null;
        String query = null;
        String songTypes = null;
        PVServices pvServices = null;
        List<Integer> tagId = null;
        List<Integer> artistId = null;
        Boolean childVoicebanks = null;
        List<AdvancedSearchFilterParams> advancedFilters = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        SongSortRule sort = null;
        NameMatchMode nameMatchMode = null;
        SongOptionalFields fields = null;
        ContentLanguagePreference lang = null;
        SongInListForApiContractPartialFindResult response = api.apiSongListsListIdSongsGet(listId, query, songTypes, pvServices, tagId, artistId, childVoicebanks, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiSongListsPostTest() {
        SongListForEditContract songListForEditContract = null;
        Integer response = api.apiSongListsPost(songListForEditContract);

        // TODO: test validations
    }
    
}
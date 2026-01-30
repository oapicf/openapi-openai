

# FileSearchRankingOptions

The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 

The class is defined in **[FileSearchRankingOptions.java](../../src/main/java/org/openapitools/model/FileSearchRankingOptions.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranker** | [**RankerEnum**](#RankerEnum) | The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. |  [optional property]
**scoreThreshold** | `BigDecimal` | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## RankerEnum

Name | Value
---- | -----
AUTO | `"auto"`
DEFAULT_2024_08_21 | `"default_2024_08_21"`




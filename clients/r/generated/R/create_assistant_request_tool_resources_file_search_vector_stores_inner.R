#' Create a new CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
#'
#' @description
#' CreateAssistantRequestToolResourcesFileSearchVectorStoresInner Class
#'
#' @docType class
#' @title CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
#' @description CreateAssistantRequestToolResourcesFileSearchVectorStoresInner Class
#' @format An \code{R6Class} generator object
#' @field file_ids A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. list(character) [optional]
#' @field chunking_strategy  \link{CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssistantRequestToolResourcesFileSearchVectorStoresInner <- R6::R6Class(
  "CreateAssistantRequestToolResourcesFileSearchVectorStoresInner",
  public = list(
    `file_ids` = NULL,
    `chunking_strategy` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new CreateAssistantRequestToolResourcesFileSearchVectorStoresInner class.
    #'
    #' @param file_ids A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.
    #' @param chunking_strategy chunking_strategy
    #' @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`file_ids` = NULL, `chunking_strategy` = NULL, `metadata` = NULL, ...) {
      if (!is.null(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
      }
      if (!is.null(`chunking_strategy`)) {
        stopifnot(R6::is.R6(`chunking_strategy`))
        self$`chunking_strategy` <- `chunking_strategy`
      }
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateAssistantRequestToolResourcesFileSearchVectorStoresInner as a base R list.
    #' @examples
    #' # convert array of CreateAssistantRequestToolResourcesFileSearchVectorStoresInner (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateAssistantRequestToolResourcesFileSearchVectorStoresInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerObject <- list()
      if (!is.null(self$`file_ids`)) {
        CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerObject[["file_ids"]] <-
          self$`file_ids`
      }
      if (!is.null(self$`chunking_strategy`)) {
        CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerObject[["chunking_strategy"]] <-
          self$`chunking_strategy`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerObject[["metadata"]] <-
          self$`metadata`
      }
      return(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`chunking_strategy`)) {
        `chunking_strategy_object` <- CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy$new()
        `chunking_strategy_object`$fromJSON(jsonlite::toJSON(this_object$`chunking_strategy`, auto_unbox = TRUE, digits = NA))
        self$`chunking_strategy` <- `chunking_strategy_object`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateAssistantRequestToolResourcesFileSearchVectorStoresInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self$`chunking_strategy` <- CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy$new()$fromJSON(jsonlite::toJSON(this_object$`chunking_strategy`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssistantRequestToolResourcesFileSearchVectorStoresInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`file_ids`) > 10000) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (length(self$`file_ids`) > 10000) {
        invalid_fields["file_ids"] <- "Invalid length for `file_ids`, number of items must be less than or equal to 10000."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateAssistantRequestToolResourcesFileSearchVectorStoresInner$unlock()
#
## Below is an example to define the print function
# CreateAssistantRequestToolResourcesFileSearchVectorStoresInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssistantRequestToolResourcesFileSearchVectorStoresInner$lock()


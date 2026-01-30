#' Create a new CreateVectorStoreFileBatchRequest
#'
#' @description
#' CreateVectorStoreFileBatchRequest Class
#'
#' @docType class
#' @title CreateVectorStoreFileBatchRequest
#' @description CreateVectorStoreFileBatchRequest Class
#' @format An \code{R6Class} generator object
#' @field file_ids A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. list(character)
#' @field chunking_strategy  \link{ChunkingStrategyRequestParam} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateVectorStoreFileBatchRequest <- R6::R6Class(
  "CreateVectorStoreFileBatchRequest",
  public = list(
    `file_ids` = NULL,
    `chunking_strategy` = NULL,

    #' @description
    #' Initialize a new CreateVectorStoreFileBatchRequest class.
    #'
    #' @param file_ids A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
    #' @param chunking_strategy chunking_strategy
    #' @param ... Other optional arguments.
    initialize = function(`file_ids`, `chunking_strategy` = NULL, ...) {
      if (!missing(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
      }
      if (!is.null(`chunking_strategy`)) {
        stopifnot(R6::is.R6(`chunking_strategy`))
        self$`chunking_strategy` <- `chunking_strategy`
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
    #' @return CreateVectorStoreFileBatchRequest as a base R list.
    #' @examples
    #' # convert array of CreateVectorStoreFileBatchRequest (x) to a data frame
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
    #' Convert CreateVectorStoreFileBatchRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateVectorStoreFileBatchRequestObject <- list()
      if (!is.null(self$`file_ids`)) {
        CreateVectorStoreFileBatchRequestObject[["file_ids"]] <-
          self$`file_ids`
      }
      if (!is.null(self$`chunking_strategy`)) {
        CreateVectorStoreFileBatchRequestObject[["chunking_strategy"]] <-
          self$`chunking_strategy`$toSimpleType()
      }
      return(CreateVectorStoreFileBatchRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateVectorStoreFileBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateVectorStoreFileBatchRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`chunking_strategy`)) {
        `chunking_strategy_object` <- ChunkingStrategyRequestParam$new()
        `chunking_strategy_object`$fromJSON(jsonlite::toJSON(this_object$`chunking_strategy`, auto_unbox = TRUE, digits = NA))
        self$`chunking_strategy` <- `chunking_strategy_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateVectorStoreFileBatchRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateVectorStoreFileBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateVectorStoreFileBatchRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self$`chunking_strategy` <- ChunkingStrategyRequestParam$new()$fromJSON(jsonlite::toJSON(this_object$`chunking_strategy`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateVectorStoreFileBatchRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `file_ids`
      if (!is.null(input_json$`file_ids`)) {
        stopifnot(is.vector(input_json$`file_ids`), length(input_json$`file_ids`) != 0)
        tmp <- sapply(input_json$`file_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateVectorStoreFileBatchRequest: the required field `file_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateVectorStoreFileBatchRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `file_ids` is null
      if (is.null(self$`file_ids`)) {
        return(FALSE)
      }

      if (length(self$`file_ids`) > 500) {
        return(FALSE)
      }
      if (length(self$`file_ids`) < 1) {
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
      # check if the required `file_ids` is null
      if (is.null(self$`file_ids`)) {
        invalid_fields["file_ids"] <- "Non-nullable required field `file_ids` cannot be null."
      }

      if (length(self$`file_ids`) > 500) {
        invalid_fields["file_ids"] <- "Invalid length for `file_ids`, number of items must be less than or equal to 500."
      }
      if (length(self$`file_ids`) < 1) {
        invalid_fields["file_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CreateVectorStoreFileBatchRequest$unlock()
#
## Below is an example to define the print function
# CreateVectorStoreFileBatchRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateVectorStoreFileBatchRequest$lock()


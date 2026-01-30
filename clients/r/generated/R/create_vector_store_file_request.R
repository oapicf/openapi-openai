#' Create a new CreateVectorStoreFileRequest
#'
#' @description
#' CreateVectorStoreFileRequest Class
#'
#' @docType class
#' @title CreateVectorStoreFileRequest
#' @description CreateVectorStoreFileRequest Class
#' @format An \code{R6Class} generator object
#' @field file_id A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. character
#' @field chunking_strategy  \link{ChunkingStrategyRequestParam} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateVectorStoreFileRequest <- R6::R6Class(
  "CreateVectorStoreFileRequest",
  public = list(
    `file_id` = NULL,
    `chunking_strategy` = NULL,

    #' @description
    #' Initialize a new CreateVectorStoreFileRequest class.
    #'
    #' @param file_id A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
    #' @param chunking_strategy chunking_strategy
    #' @param ... Other optional arguments.
    initialize = function(`file_id`, `chunking_strategy` = NULL, ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
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
    #' @return CreateVectorStoreFileRequest as a base R list.
    #' @examples
    #' # convert array of CreateVectorStoreFileRequest (x) to a data frame
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
    #' Convert CreateVectorStoreFileRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateVectorStoreFileRequestObject <- list()
      if (!is.null(self$`file_id`)) {
        CreateVectorStoreFileRequestObject[["file_id"]] <-
          self$`file_id`
      }
      if (!is.null(self$`chunking_strategy`)) {
        CreateVectorStoreFileRequestObject[["chunking_strategy"]] <-
          self$`chunking_strategy`$toSimpleType()
      }
      return(CreateVectorStoreFileRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateVectorStoreFileRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateVectorStoreFileRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
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
    #' @return CreateVectorStoreFileRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateVectorStoreFileRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateVectorStoreFileRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self$`chunking_strategy` <- ChunkingStrategyRequestParam$new()$fromJSON(jsonlite::toJSON(this_object$`chunking_strategy`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateVectorStoreFileRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `file_id`
      if (!is.null(input_json$`file_id`)) {
        if (!(is.character(input_json$`file_id`) && length(input_json$`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", input_json$`file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateVectorStoreFileRequest: the required field `file_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateVectorStoreFileRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
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
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        invalid_fields["file_id"] <- "Non-nullable required field `file_id` cannot be null."
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
# CreateVectorStoreFileRequest$unlock()
#
## Below is an example to define the print function
# CreateVectorStoreFileRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateVectorStoreFileRequest$lock()


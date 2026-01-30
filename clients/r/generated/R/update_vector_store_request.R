#' Create a new UpdateVectorStoreRequest
#'
#' @description
#' UpdateVectorStoreRequest Class
#'
#' @docType class
#' @title UpdateVectorStoreRequest
#' @description UpdateVectorStoreRequest Class
#' @format An \code{R6Class} generator object
#' @field name The name of the vector store. character [optional]
#' @field expires_after  \link{VectorStoreExpirationAfter} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateVectorStoreRequest <- R6::R6Class(
  "UpdateVectorStoreRequest",
  public = list(
    `name` = NULL,
    `expires_after` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new UpdateVectorStoreRequest class.
    #'
    #' @param name The name of the vector store.
    #' @param expires_after expires_after
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `expires_after` = NULL, `metadata` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`expires_after`)) {
        stopifnot(R6::is.R6(`expires_after`))
        self$`expires_after` <- `expires_after`
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
    #' @return UpdateVectorStoreRequest as a base R list.
    #' @examples
    #' # convert array of UpdateVectorStoreRequest (x) to a data frame
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
    #' Convert UpdateVectorStoreRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UpdateVectorStoreRequestObject <- list()
      if (!is.null(self$`name`)) {
        UpdateVectorStoreRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`expires_after`)) {
        UpdateVectorStoreRequestObject[["expires_after"]] <-
          self$`expires_after`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        UpdateVectorStoreRequestObject[["metadata"]] <-
          self$`metadata`
      }
      return(UpdateVectorStoreRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateVectorStoreRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateVectorStoreRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`expires_after`)) {
        `expires_after_object` <- VectorStoreExpirationAfter$new()
        `expires_after_object`$fromJSON(jsonlite::toJSON(this_object$`expires_after`, auto_unbox = TRUE, digits = NA))
        self$`expires_after` <- `expires_after_object`
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
    #' @return UpdateVectorStoreRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateVectorStoreRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateVectorStoreRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`expires_after` <- VectorStoreExpirationAfter$new()$fromJSON(jsonlite::toJSON(this_object$`expires_after`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateVectorStoreRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateVectorStoreRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# UpdateVectorStoreRequest$unlock()
#
## Below is an example to define the print function
# UpdateVectorStoreRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateVectorStoreRequest$lock()


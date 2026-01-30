#' Create a new ModifyThreadRequest
#'
#' @description
#' ModifyThreadRequest Class
#'
#' @docType class
#' @title ModifyThreadRequest
#' @description ModifyThreadRequest Class
#' @format An \code{R6Class} generator object
#' @field tool_resources  \link{ModifyThreadRequestToolResources} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModifyThreadRequest <- R6::R6Class(
  "ModifyThreadRequest",
  public = list(
    `tool_resources` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new ModifyThreadRequest class.
    #'
    #' @param tool_resources tool_resources
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`tool_resources` = NULL, `metadata` = NULL, ...) {
      if (!is.null(`tool_resources`)) {
        stopifnot(R6::is.R6(`tool_resources`))
        self$`tool_resources` <- `tool_resources`
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
    #' @return ModifyThreadRequest as a base R list.
    #' @examples
    #' # convert array of ModifyThreadRequest (x) to a data frame
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
    #' Convert ModifyThreadRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ModifyThreadRequestObject <- list()
      if (!is.null(self$`tool_resources`)) {
        ModifyThreadRequestObject[["tool_resources"]] <-
          self$`tool_resources`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        ModifyThreadRequestObject[["metadata"]] <-
          self$`metadata`
      }
      return(ModifyThreadRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyThreadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyThreadRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`tool_resources`)) {
        `tool_resources_object` <- ModifyThreadRequestToolResources$new()
        `tool_resources_object`$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
        self$`tool_resources` <- `tool_resources_object`
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
    #' @return ModifyThreadRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyThreadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyThreadRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`tool_resources` <- ModifyThreadRequestToolResources$new()$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to ModifyThreadRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModifyThreadRequest
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
# ModifyThreadRequest$unlock()
#
## Below is an example to define the print function
# ModifyThreadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModifyThreadRequest$lock()


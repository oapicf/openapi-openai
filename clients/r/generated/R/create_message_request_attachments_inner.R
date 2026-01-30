#' Create a new CreateMessageRequestAttachmentsInner
#'
#' @description
#' CreateMessageRequestAttachmentsInner Class
#'
#' @docType class
#' @title CreateMessageRequestAttachmentsInner
#' @description CreateMessageRequestAttachmentsInner Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the file to attach to the message. character [optional]
#' @field tools The tools to add this file to. list(\link{CreateMessageRequestAttachmentsInnerToolsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateMessageRequestAttachmentsInner <- R6::R6Class(
  "CreateMessageRequestAttachmentsInner",
  public = list(
    `file_id` = NULL,
    `tools` = NULL,

    #' @description
    #' Initialize a new CreateMessageRequestAttachmentsInner class.
    #'
    #' @param file_id The ID of the file to attach to the message.
    #' @param tools The tools to add this file to.
    #' @param ... Other optional arguments.
    initialize = function(`file_id` = NULL, `tools` = NULL, ...) {
      if (!is.null(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
      if (!is.null(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
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
    #' @return CreateMessageRequestAttachmentsInner as a base R list.
    #' @examples
    #' # convert array of CreateMessageRequestAttachmentsInner (x) to a data frame
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
    #' Convert CreateMessageRequestAttachmentsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateMessageRequestAttachmentsInnerObject <- list()
      if (!is.null(self$`file_id`)) {
        CreateMessageRequestAttachmentsInnerObject[["file_id"]] <-
          self$`file_id`
      }
      if (!is.null(self$`tools`)) {
        CreateMessageRequestAttachmentsInnerObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      return(CreateMessageRequestAttachmentsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMessageRequestAttachmentsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMessageRequestAttachmentsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[CreateMessageRequestAttachmentsInnerToolsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateMessageRequestAttachmentsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateMessageRequestAttachmentsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateMessageRequestAttachmentsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[CreateMessageRequestAttachmentsInnerToolsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateMessageRequestAttachmentsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateMessageRequestAttachmentsInner
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
# CreateMessageRequestAttachmentsInner$unlock()
#
## Below is an example to define the print function
# CreateMessageRequestAttachmentsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateMessageRequestAttachmentsInner$lock()


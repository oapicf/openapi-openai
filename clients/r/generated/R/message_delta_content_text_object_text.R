#' Create a new MessageDeltaContentTextObjectText
#'
#' @description
#' MessageDeltaContentTextObjectText Class
#'
#' @docType class
#' @title MessageDeltaContentTextObjectText
#' @description MessageDeltaContentTextObjectText Class
#' @format An \code{R6Class} generator object
#' @field value The data that makes up the text. character [optional]
#' @field annotations  list(\link{MessageDeltaContentTextObjectTextAnnotationsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentTextObjectText <- R6::R6Class(
  "MessageDeltaContentTextObjectText",
  public = list(
    `value` = NULL,
    `annotations` = NULL,

    #' @description
    #' Initialize a new MessageDeltaContentTextObjectText class.
    #'
    #' @param value The data that makes up the text.
    #' @param annotations annotations
    #' @param ... Other optional arguments.
    initialize = function(`value` = NULL, `annotations` = NULL, ...) {
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`annotations`)) {
        stopifnot(is.vector(`annotations`), length(`annotations`) != 0)
        sapply(`annotations`, function(x) stopifnot(R6::is.R6(x)))
        self$`annotations` <- `annotations`
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
    #' @return MessageDeltaContentTextObjectText as a base R list.
    #' @examples
    #' # convert array of MessageDeltaContentTextObjectText (x) to a data frame
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
    #' Convert MessageDeltaContentTextObjectText to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageDeltaContentTextObjectTextObject <- list()
      if (!is.null(self$`value`)) {
        MessageDeltaContentTextObjectTextObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`annotations`)) {
        MessageDeltaContentTextObjectTextObject[["annotations"]] <-
          lapply(self$`annotations`, function(x) x$toSimpleType())
      }
      return(MessageDeltaContentTextObjectTextObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextObjectText
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextObjectText
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`annotations`)) {
        self$`annotations` <- ApiClient$new()$deserializeObj(this_object$`annotations`, "array[MessageDeltaContentTextObjectTextAnnotationsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MessageDeltaContentTextObjectText in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextObjectText
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextObjectText
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`annotations` <- ApiClient$new()$deserializeObj(this_object$`annotations`, "array[MessageDeltaContentTextObjectTextAnnotationsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaContentTextObjectText and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentTextObjectText
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
# MessageDeltaContentTextObjectText$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentTextObjectText$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentTextObjectText$lock()


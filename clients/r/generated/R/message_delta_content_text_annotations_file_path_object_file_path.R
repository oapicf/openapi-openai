#' Create a new MessageDeltaContentTextAnnotationsFilePathObjectFilePath
#'
#' @description
#' MessageDeltaContentTextAnnotationsFilePathObjectFilePath Class
#'
#' @docType class
#' @title MessageDeltaContentTextAnnotationsFilePathObjectFilePath
#' @description MessageDeltaContentTextAnnotationsFilePathObjectFilePath Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the file that was generated. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentTextAnnotationsFilePathObjectFilePath <- R6::R6Class(
  "MessageDeltaContentTextAnnotationsFilePathObjectFilePath",
  public = list(
    `file_id` = NULL,

    #' @description
    #' Initialize a new MessageDeltaContentTextAnnotationsFilePathObjectFilePath class.
    #'
    #' @param file_id The ID of the file that was generated.
    #' @param ... Other optional arguments.
    initialize = function(`file_id` = NULL, ...) {
      if (!is.null(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
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
    #' @return MessageDeltaContentTextAnnotationsFilePathObjectFilePath as a base R list.
    #' @examples
    #' # convert array of MessageDeltaContentTextAnnotationsFilePathObjectFilePath (x) to a data frame
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
    #' Convert MessageDeltaContentTextAnnotationsFilePathObjectFilePath to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageDeltaContentTextAnnotationsFilePathObjectFilePathObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectFilePathObject[["file_id"]] <-
          self$`file_id`
      }
      return(MessageDeltaContentTextAnnotationsFilePathObjectFilePathObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextAnnotationsFilePathObjectFilePath
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MessageDeltaContentTextAnnotationsFilePathObjectFilePath in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextAnnotationsFilePathObjectFilePath
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaContentTextAnnotationsFilePathObjectFilePath and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentTextAnnotationsFilePathObjectFilePath
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
# MessageDeltaContentTextAnnotationsFilePathObjectFilePath$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentTextAnnotationsFilePathObjectFilePath$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentTextAnnotationsFilePathObjectFilePath$lock()


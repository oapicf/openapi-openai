#' Create a new MessageDeltaContentImageFileObjectImageFile
#'
#' @description
#' MessageDeltaContentImageFileObjectImageFile Class
#'
#' @docType class
#' @title MessageDeltaContentImageFileObjectImageFile
#' @description MessageDeltaContentImageFileObjectImageFile Class
#' @format An \code{R6Class} generator object
#' @field file_id The [File](/docs/api-reference/files) ID of the image in the message content. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentImageFileObjectImageFile <- R6::R6Class(
  "MessageDeltaContentImageFileObjectImageFile",
  public = list(
    `file_id` = NULL,

    #' @description
    #' Initialize a new MessageDeltaContentImageFileObjectImageFile class.
    #'
    #' @param file_id The [File](/docs/api-reference/files) ID of the image in the message content.
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
    #' @return MessageDeltaContentImageFileObjectImageFile as a base R list.
    #' @examples
    #' # convert array of MessageDeltaContentImageFileObjectImageFile (x) to a data frame
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
    #' Convert MessageDeltaContentImageFileObjectImageFile to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageDeltaContentImageFileObjectImageFileObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageDeltaContentImageFileObjectImageFileObject[["file_id"]] <-
          self$`file_id`
      }
      return(MessageDeltaContentImageFileObjectImageFileObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObjectImageFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageFileObjectImageFile
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
    #' @return MessageDeltaContentImageFileObjectImageFile in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObjectImageFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageFileObjectImageFile
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaContentImageFileObjectImageFile and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentImageFileObjectImageFile
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
# MessageDeltaContentImageFileObjectImageFile$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentImageFileObjectImageFile$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentImageFileObjectImageFile$lock()


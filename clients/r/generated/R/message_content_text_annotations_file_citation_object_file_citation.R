#' Create a new MessageContentTextAnnotationsFileCitationObjectFileCitation
#'
#' @description
#' MessageContentTextAnnotationsFileCitationObjectFileCitation Class
#'
#' @docType class
#' @title MessageContentTextAnnotationsFileCitationObjectFileCitation
#' @description MessageContentTextAnnotationsFileCitationObjectFileCitation Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the specific File the citation is from. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentTextAnnotationsFileCitationObjectFileCitation <- R6::R6Class(
  "MessageContentTextAnnotationsFileCitationObjectFileCitation",
  public = list(
    `file_id` = NULL,

    #' @description
    #' Initialize a new MessageContentTextAnnotationsFileCitationObjectFileCitation class.
    #'
    #' @param file_id The ID of the specific File the citation is from.
    #' @param ... Other optional arguments.
    initialize = function(`file_id`, ...) {
      if (!missing(`file_id`)) {
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
    #' @return MessageContentTextAnnotationsFileCitationObjectFileCitation as a base R list.
    #' @examples
    #' # convert array of MessageContentTextAnnotationsFileCitationObjectFileCitation (x) to a data frame
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
    #' Convert MessageContentTextAnnotationsFileCitationObjectFileCitation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageContentTextAnnotationsFileCitationObjectFileCitationObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageContentTextAnnotationsFileCitationObjectFileCitationObject[["file_id"]] <-
          self$`file_id`
      }
      return(MessageContentTextAnnotationsFileCitationObjectFileCitationObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
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
    #' @return MessageContentTextAnnotationsFileCitationObjectFileCitation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageContentTextAnnotationsFileCitationObjectFileCitation and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObjectFileCitation: the required field `file_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentTextAnnotationsFileCitationObjectFileCitation
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
# MessageContentTextAnnotationsFileCitationObjectFileCitation$unlock()
#
## Below is an example to define the print function
# MessageContentTextAnnotationsFileCitationObjectFileCitation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentTextAnnotationsFileCitationObjectFileCitation$lock()


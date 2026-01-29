#' Create a new ChatCompletionRequestMessageContentPartText
#'
#' @description
#' ChatCompletionRequestMessageContentPartText Class
#'
#' @docType class
#' @title ChatCompletionRequestMessageContentPartText
#' @description ChatCompletionRequestMessageContentPartText Class
#' @format An \code{R6Class} generator object
#' @field type The type of the content part. character
#' @field text The text content. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessageContentPartText <- R6::R6Class(
  "ChatCompletionRequestMessageContentPartText",
  public = list(
    `type` = NULL,
    `text` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestMessageContentPartText class.
    #'
    #' @param type The type of the content part.
    #' @param text The text content.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `text`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("text"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
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
    #' @return ChatCompletionRequestMessageContentPartText as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestMessageContentPartText (x) to a data frame
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
    #' Convert ChatCompletionRequestMessageContentPartText to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestMessageContentPartTextObject <- list()
      if (!is.null(self$`type`)) {
        ChatCompletionRequestMessageContentPartTextObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`text`)) {
        ChatCompletionRequestMessageContentPartTextObject[["text"]] <-
          self$`text`
      }
      return(ChatCompletionRequestMessageContentPartTextObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartText
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartText
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionRequestMessageContentPartText in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartText
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartText
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`text` <- this_object$`text`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestMessageContentPartText and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartText: the required field `type` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartText: the required field `text` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestMessageContentPartText
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
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
# ChatCompletionRequestMessageContentPartText$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestMessageContentPartText$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestMessageContentPartText$lock()


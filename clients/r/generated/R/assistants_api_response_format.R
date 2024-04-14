#' Create a new AssistantsApiResponseFormat
#'
#' @description
#' An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
#'
#' @docType class
#' @title AssistantsApiResponseFormat
#' @description AssistantsApiResponseFormat Class
#' @format An \code{R6Class} generator object
#' @field type Must be one of `text` or `json_object`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantsApiResponseFormat <- R6::R6Class(
  "AssistantsApiResponseFormat",
  public = list(
    `type` = NULL,
    #' Initialize a new AssistantsApiResponseFormat class.
    #'
    #' @description
    #' Initialize a new AssistantsApiResponseFormat class.
    #'
    #' @param type Must be one of `text` or `json_object`.. Default to "text".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = "text", ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("text", "json_object"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AssistantsApiResponseFormat in JSON format
    #' @export
    toJSON = function() {
      AssistantsApiResponseFormatObject <- list()
      if (!is.null(self$`type`)) {
        AssistantsApiResponseFormatObject[["type"]] <-
          self$`type`
      }
      AssistantsApiResponseFormatObject
    },
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiResponseFormat
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text", "json_object"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AssistantsApiResponseFormat in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiResponseFormat
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text", "json_object"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to AssistantsApiResponseFormat
    #'
    #' @description
    #' Validate JSON input with respect to AssistantsApiResponseFormat and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantsApiResponseFormat
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AssistantsApiResponseFormat$unlock()
#
## Below is an example to define the print function
# AssistantsApiResponseFormat$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantsApiResponseFormat$lock()


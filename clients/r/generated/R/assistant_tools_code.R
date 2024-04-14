#' Create a new AssistantToolsCode
#'
#' @description
#' AssistantToolsCode Class
#'
#' @docType class
#' @title AssistantToolsCode
#' @description AssistantToolsCode Class
#' @format An \code{R6Class} generator object
#' @field type The type of tool being defined: `code_interpreter` character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantToolsCode <- R6::R6Class(
  "AssistantToolsCode",
  public = list(
    `type` = NULL,
    #' Initialize a new AssistantToolsCode class.
    #'
    #' @description
    #' Initialize a new AssistantToolsCode class.
    #'
    #' @param type The type of tool being defined: `code_interpreter`
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("code_interpreter"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"code_interpreter\".", sep = ""))
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
    #' @return AssistantToolsCode in JSON format
    #' @export
    toJSON = function() {
      AssistantToolsCodeObject <- list()
      if (!is.null(self$`type`)) {
        AssistantToolsCodeObject[["type"]] <-
          self$`type`
      }
      AssistantToolsCodeObject
    },
    #' Deserialize JSON string into an instance of AssistantToolsCode
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsCode
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsCode
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("code_interpreter"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"code_interpreter\".", sep = ""))
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
    #' @return AssistantToolsCode in JSON format
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
    #' Deserialize JSON string into an instance of AssistantToolsCode
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsCode
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsCode
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("code_interpreter"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"code_interpreter\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to AssistantToolsCode
    #'
    #' @description
    #' Validate JSON input with respect to AssistantToolsCode and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantToolsCode: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantToolsCode
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

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
# AssistantToolsCode$unlock()
#
## Below is an example to define the print function
# AssistantToolsCode$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantToolsCode$lock()


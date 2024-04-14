#' Create a new AssistantsApiNamedToolChoice
#'
#' @description
#' Specifies a tool the model should use. Use to force the model to call a specific tool.
#'
#' @docType class
#' @title AssistantsApiNamedToolChoice
#' @description AssistantsApiNamedToolChoice Class
#' @format An \code{R6Class} generator object
#' @field type The type of the tool. If type is `function`, the function name must be set character
#' @field function  \link{ChatCompletionNamedToolChoiceFunction} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantsApiNamedToolChoice <- R6::R6Class(
  "AssistantsApiNamedToolChoice",
  public = list(
    `type` = NULL,
    `function` = NULL,
    #' Initialize a new AssistantsApiNamedToolChoice class.
    #'
    #' @description
    #' Initialize a new AssistantsApiNamedToolChoice class.
    #'
    #' @param type The type of the tool. If type is `function`, the function name must be set
    #' @param function function
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `function` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("function", "code_interpreter", "retrieval"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"function\", \"code_interpreter\", \"retrieval\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`function`)) {
        stopifnot(R6::is.R6(`function`))
        self$`function` <- `function`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AssistantsApiNamedToolChoice in JSON format
    #' @export
    toJSON = function() {
      AssistantsApiNamedToolChoiceObject <- list()
      if (!is.null(self$`type`)) {
        AssistantsApiNamedToolChoiceObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        AssistantsApiNamedToolChoiceObject[["function"]] <-
          self$`function`$toJSON()
      }
      AssistantsApiNamedToolChoiceObject
    },
    #' Deserialize JSON string into an instance of AssistantsApiNamedToolChoice
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiNamedToolChoice
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiNamedToolChoice
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function", "code_interpreter", "retrieval"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\", \"code_interpreter\", \"retrieval\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`function`)) {
        `Function__object` <- ChatCompletionNamedToolChoiceFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AssistantsApiNamedToolChoice in JSON format
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
        },
        if (!is.null(self$`function`)) {
          sprintf(
          '"function":
          %s
          ',
          jsonlite::toJSON(self$`function`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AssistantsApiNamedToolChoice
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiNamedToolChoice
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiNamedToolChoice
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function", "code_interpreter", "retrieval"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\", \"code_interpreter\", \"retrieval\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- ChatCompletionNamedToolChoiceFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to AssistantsApiNamedToolChoice
    #'
    #' @description
    #' Validate JSON input with respect to AssistantsApiNamedToolChoice and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AssistantsApiNamedToolChoice: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantsApiNamedToolChoice
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
# AssistantsApiNamedToolChoice$unlock()
#
## Below is an example to define the print function
# AssistantsApiNamedToolChoice$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantsApiNamedToolChoice$lock()


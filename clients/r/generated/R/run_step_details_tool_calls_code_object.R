#' Create a new RunStepDetailsToolCallsCodeObject
#'
#' @description
#' Details of the Code Interpreter tool call the run step was involved in.
#'
#' @docType class
#' @title RunStepDetailsToolCallsCodeObject
#' @description RunStepDetailsToolCallsCodeObject Class
#' @format An \code{R6Class} generator object
#' @field id The ID of the tool call. character
#' @field type The type of tool call. This is always going to be `code_interpreter` for this type of tool call. character
#' @field code_interpreter  \link{RunStepDetailsToolCallsCodeObjectCodeInterpreter}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsCodeObject <- R6::R6Class(
  "RunStepDetailsToolCallsCodeObject",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `code_interpreter` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsCodeObject class.
    #'
    #' @param id The ID of the tool call.
    #' @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    #' @param code_interpreter code_interpreter
    #' @param ... Other optional arguments.
    initialize = function(`id`, `type`, `code_interpreter`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("code_interpreter"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"code_interpreter\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`code_interpreter`)) {
        stopifnot(R6::is.R6(`code_interpreter`))
        self$`code_interpreter` <- `code_interpreter`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsCodeObject in JSON format
    toJSON = function() {
      RunStepDetailsToolCallsCodeObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunStepDetailsToolCallsCodeObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsCodeObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`code_interpreter`)) {
        RunStepDetailsToolCallsCodeObjectObject[["code_interpreter"]] <-
          self$`code_interpreter`$toJSON()
      }
      RunStepDetailsToolCallsCodeObjectObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("code_interpreter"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"code_interpreter\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`code_interpreter`)) {
        `code_interpreter_object` <- RunStepDetailsToolCallsCodeObjectCodeInterpreter$new()
        `code_interpreter_object`$fromJSON(jsonlite::toJSON(this_object$`code_interpreter`, auto_unbox = TRUE, digits = NA))
        self$`code_interpreter` <- `code_interpreter_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsCodeObject in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`code_interpreter`)) {
          sprintf(
          '"code_interpreter":
          %s
          ',
          jsonlite::toJSON(self$`code_interpreter`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("code_interpreter"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"code_interpreter\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`code_interpreter` <- RunStepDetailsToolCallsCodeObjectCodeInterpreter$new()$fromJSON(jsonlite::toJSON(this_object$`code_interpreter`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsCodeObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeObject: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeObject: the required field `type` is missing."))
      }
      # check the required field `code_interpreter`
      if (!is.null(input_json$`code_interpreter`)) {
        stopifnot(R6::is.R6(input_json$`code_interpreter`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeObject: the required field `code_interpreter` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsCodeObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `code_interpreter` is null
      if (is.null(self$`code_interpreter`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `code_interpreter` is null
      if (is.null(self$`code_interpreter`)) {
        invalid_fields["code_interpreter"] <- "Non-nullable required field `code_interpreter` cannot be null."
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
# RunStepDetailsToolCallsCodeObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsCodeObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsCodeObject$lock()


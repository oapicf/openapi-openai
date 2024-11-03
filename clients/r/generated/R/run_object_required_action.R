#' Create a new RunObjectRequiredAction
#'
#' @description
#' Details on the action required to continue the run. Will be `null` if no action is required.
#'
#' @docType class
#' @title RunObjectRequiredAction
#' @description RunObjectRequiredAction Class
#' @format An \code{R6Class} generator object
#' @field type For now, this is always `submit_tool_outputs`. character
#' @field submit_tool_outputs  \link{RunObjectRequiredActionSubmitToolOutputs}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunObjectRequiredAction <- R6::R6Class(
  "RunObjectRequiredAction",
  public = list(
    `type` = NULL,
    `submit_tool_outputs` = NULL,

    #' @description
    #' Initialize a new RunObjectRequiredAction class.
    #'
    #' @param type For now, this is always `submit_tool_outputs`.
    #' @param submit_tool_outputs submit_tool_outputs
    #' @param ... Other optional arguments.
    initialize = function(`type`, `submit_tool_outputs`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("submit_tool_outputs"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"submit_tool_outputs\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`submit_tool_outputs`)) {
        stopifnot(R6::is.R6(`submit_tool_outputs`))
        self$`submit_tool_outputs` <- `submit_tool_outputs`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunObjectRequiredAction in JSON format
    toJSON = function() {
      RunObjectRequiredActionObject <- list()
      if (!is.null(self$`type`)) {
        RunObjectRequiredActionObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`submit_tool_outputs`)) {
        RunObjectRequiredActionObject[["submit_tool_outputs"]] <-
          self$`submit_tool_outputs`$toJSON()
      }
      RunObjectRequiredActionObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunObjectRequiredAction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectRequiredAction
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("submit_tool_outputs"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"submit_tool_outputs\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`submit_tool_outputs`)) {
        `submit_tool_outputs_object` <- RunObjectRequiredActionSubmitToolOutputs$new()
        `submit_tool_outputs_object`$fromJSON(jsonlite::toJSON(this_object$`submit_tool_outputs`, auto_unbox = TRUE, digits = NA))
        self$`submit_tool_outputs` <- `submit_tool_outputs_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunObjectRequiredAction in JSON format
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
        if (!is.null(self$`submit_tool_outputs`)) {
          sprintf(
          '"submit_tool_outputs":
          %s
          ',
          jsonlite::toJSON(self$`submit_tool_outputs`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunObjectRequiredAction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectRequiredAction
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("submit_tool_outputs"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"submit_tool_outputs\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`submit_tool_outputs` <- RunObjectRequiredActionSubmitToolOutputs$new()$fromJSON(jsonlite::toJSON(this_object$`submit_tool_outputs`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunObjectRequiredAction and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunObjectRequiredAction: the required field `type` is missing."))
      }
      # check the required field `submit_tool_outputs`
      if (!is.null(input_json$`submit_tool_outputs`)) {
        stopifnot(R6::is.R6(input_json$`submit_tool_outputs`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObjectRequiredAction: the required field `submit_tool_outputs` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunObjectRequiredAction
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

      # check if the required `submit_tool_outputs` is null
      if (is.null(self$`submit_tool_outputs`)) {
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

      # check if the required `submit_tool_outputs` is null
      if (is.null(self$`submit_tool_outputs`)) {
        invalid_fields["submit_tool_outputs"] <- "Non-nullable required field `submit_tool_outputs` cannot be null."
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
# RunObjectRequiredAction$unlock()
#
## Below is an example to define the print function
# RunObjectRequiredAction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunObjectRequiredAction$lock()


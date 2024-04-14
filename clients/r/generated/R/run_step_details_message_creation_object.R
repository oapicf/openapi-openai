#' Create a new RunStepDetailsMessageCreationObject
#'
#' @description
#' Details of the message creation by the run step.
#'
#' @docType class
#' @title RunStepDetailsMessageCreationObject
#' @description RunStepDetailsMessageCreationObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `message_creation`. character
#' @field message_creation  \link{RunStepDetailsMessageCreationObjectMessageCreation}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsMessageCreationObject <- R6::R6Class(
  "RunStepDetailsMessageCreationObject",
  public = list(
    `type` = NULL,
    `message_creation` = NULL,
    #' Initialize a new RunStepDetailsMessageCreationObject class.
    #'
    #' @description
    #' Initialize a new RunStepDetailsMessageCreationObject class.
    #'
    #' @param type Always `message_creation`.
    #' @param message_creation message_creation
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `message_creation`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("message_creation"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"message_creation\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`message_creation`)) {
        stopifnot(R6::is.R6(`message_creation`))
        self$`message_creation` <- `message_creation`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsMessageCreationObject in JSON format
    #' @export
    toJSON = function() {
      RunStepDetailsMessageCreationObjectObject <- list()
      if (!is.null(self$`type`)) {
        RunStepDetailsMessageCreationObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`message_creation`)) {
        RunStepDetailsMessageCreationObjectObject[["message_creation"]] <-
          self$`message_creation`$toJSON()
      }
      RunStepDetailsMessageCreationObjectObject
    },
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsMessageCreationObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("message_creation"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"message_creation\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`message_creation`)) {
        `message_creation_object` <- RunStepDetailsMessageCreationObjectMessageCreation$new()
        `message_creation_object`$fromJSON(jsonlite::toJSON(this_object$`message_creation`, auto_unbox = TRUE, digits = NA))
        self$`message_creation` <- `message_creation_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsMessageCreationObject in JSON format
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
        if (!is.null(self$`message_creation`)) {
          sprintf(
          '"message_creation":
          %s
          ',
          jsonlite::toJSON(self$`message_creation`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsMessageCreationObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("message_creation"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"message_creation\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`message_creation` <- RunStepDetailsMessageCreationObjectMessageCreation$new()$fromJSON(jsonlite::toJSON(this_object$`message_creation`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to RunStepDetailsMessageCreationObject
    #'
    #' @description
    #' Validate JSON input with respect to RunStepDetailsMessageCreationObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsMessageCreationObject: the required field `type` is missing."))
      }
      # check the required field `message_creation`
      if (!is.null(input_json$`message_creation`)) {
        stopifnot(R6::is.R6(input_json$`message_creation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsMessageCreationObject: the required field `message_creation` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsMessageCreationObject
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

      # check if the required `message_creation` is null
      if (is.null(self$`message_creation`)) {
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

      # check if the required `message_creation` is null
      if (is.null(self$`message_creation`)) {
        invalid_fields["message_creation"] <- "Non-nullable required field `message_creation` cannot be null."
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
# RunStepDetailsMessageCreationObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsMessageCreationObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsMessageCreationObject$lock()


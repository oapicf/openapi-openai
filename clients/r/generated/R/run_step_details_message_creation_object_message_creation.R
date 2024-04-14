#' Create a new RunStepDetailsMessageCreationObjectMessageCreation
#'
#' @description
#' RunStepDetailsMessageCreationObjectMessageCreation Class
#'
#' @docType class
#' @title RunStepDetailsMessageCreationObjectMessageCreation
#' @description RunStepDetailsMessageCreationObjectMessageCreation Class
#' @format An \code{R6Class} generator object
#' @field message_id The ID of the message that was created by this run step. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsMessageCreationObjectMessageCreation <- R6::R6Class(
  "RunStepDetailsMessageCreationObjectMessageCreation",
  public = list(
    `message_id` = NULL,
    #' Initialize a new RunStepDetailsMessageCreationObjectMessageCreation class.
    #'
    #' @description
    #' Initialize a new RunStepDetailsMessageCreationObjectMessageCreation class.
    #'
    #' @param message_id The ID of the message that was created by this run step.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`message_id`, ...) {
      if (!missing(`message_id`)) {
        if (!(is.character(`message_id`) && length(`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", `message_id`))
        }
        self$`message_id` <- `message_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsMessageCreationObjectMessageCreation in JSON format
    #' @export
    toJSON = function() {
      RunStepDetailsMessageCreationObjectMessageCreationObject <- list()
      if (!is.null(self$`message_id`)) {
        RunStepDetailsMessageCreationObjectMessageCreationObject[["message_id"]] <-
          self$`message_id`
      }
      RunStepDetailsMessageCreationObjectMessageCreationObject
    },
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsMessageCreationObjectMessageCreation
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message_id`)) {
        self$`message_id` <- this_object$`message_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsMessageCreationObjectMessageCreation in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`message_id`)) {
          sprintf(
          '"message_id":
            "%s"
                    ',
          self$`message_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsMessageCreationObjectMessageCreation
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message_id` <- this_object$`message_id`
      self
    },
    #' Validate JSON input with respect to RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @description
    #' Validate JSON input with respect to RunStepDetailsMessageCreationObjectMessageCreation and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `message_id`
      if (!is.null(input_json$`message_id`)) {
        if (!(is.character(input_json$`message_id`) && length(input_json$`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", input_json$`message_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsMessageCreationObjectMessageCreation: the required field `message_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsMessageCreationObjectMessageCreation
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
      # check if the required `message_id` is null
      if (is.null(self$`message_id`)) {
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
      # check if the required `message_id` is null
      if (is.null(self$`message_id`)) {
        invalid_fields["message_id"] <- "Non-nullable required field `message_id` cannot be null."
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
# RunStepDetailsMessageCreationObjectMessageCreation$unlock()
#
## Below is an example to define the print function
# RunStepDetailsMessageCreationObjectMessageCreation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsMessageCreationObjectMessageCreation$lock()


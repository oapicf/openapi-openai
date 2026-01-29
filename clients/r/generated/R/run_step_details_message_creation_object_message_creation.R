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

    #' @description
    #' Initialize a new RunStepDetailsMessageCreationObjectMessageCreation class.
    #'
    #' @param message_id The ID of the message that was created by this run step.
    #' @param ... Other optional arguments.
    initialize = function(`message_id`, ...) {
      if (!missing(`message_id`)) {
        if (!(is.character(`message_id`) && length(`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", `message_id`))
        }
        self$`message_id` <- `message_id`
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
    #' @return RunStepDetailsMessageCreationObjectMessageCreation as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsMessageCreationObjectMessageCreation (x) to a data frame
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
    #' Convert RunStepDetailsMessageCreationObjectMessageCreation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsMessageCreationObjectMessageCreationObject <- list()
      if (!is.null(self$`message_id`)) {
        RunStepDetailsMessageCreationObjectMessageCreationObject[["message_id"]] <-
          self$`message_id`
      }
      return(RunStepDetailsMessageCreationObjectMessageCreationObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsMessageCreationObjectMessageCreation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message_id`)) {
        self$`message_id` <- this_object$`message_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsMessageCreationObjectMessageCreation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsMessageCreationObjectMessageCreation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message_id` <- this_object$`message_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsMessageCreationObjectMessageCreation and throw an exception if invalid
    #'
    #' @param input the JSON input
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

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsMessageCreationObjectMessageCreation
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `message_id` is null
      if (is.null(self$`message_id`)) {
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
      # check if the required `message_id` is null
      if (is.null(self$`message_id`)) {
        invalid_fields["message_id"] <- "Non-nullable required field `message_id` cannot be null."
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
# RunStepDetailsMessageCreationObjectMessageCreation$unlock()
#
## Below is an example to define the print function
# RunStepDetailsMessageCreationObjectMessageCreation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsMessageCreationObjectMessageCreation$lock()


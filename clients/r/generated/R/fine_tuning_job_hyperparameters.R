#' Create a new FineTuningJobHyperparameters
#'
#' @description
#' The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
#'
#' @docType class
#' @title FineTuningJobHyperparameters
#' @description FineTuningJobHyperparameters Class
#' @format An \code{R6Class} generator object
#' @field n_epochs  \link{FineTuningJobHyperparametersNEpochs}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJobHyperparameters <- R6::R6Class(
  "FineTuningJobHyperparameters",
  public = list(
    `n_epochs` = NULL,
    #' Initialize a new FineTuningJobHyperparameters class.
    #'
    #' @description
    #' Initialize a new FineTuningJobHyperparameters class.
    #'
    #' @param n_epochs n_epochs
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`n_epochs`, ...) {
      if (!missing(`n_epochs`)) {
        stopifnot(R6::is.R6(`n_epochs`))
        self$`n_epochs` <- `n_epochs`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobHyperparameters in JSON format
    #' @export
    toJSON = function() {
      FineTuningJobHyperparametersObject <- list()
      if (!is.null(self$`n_epochs`)) {
        FineTuningJobHyperparametersObject[["n_epochs"]] <-
          self$`n_epochs`$toJSON()
      }
      FineTuningJobHyperparametersObject
    },
    #' Deserialize JSON string into an instance of FineTuningJobHyperparameters
    #'
    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobHyperparameters
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`n_epochs`)) {
        `n_epochs_object` <- FineTuningJobHyperparametersNEpochs$new()
        `n_epochs_object`$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
        self$`n_epochs` <- `n_epochs_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobHyperparameters in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`n_epochs`)) {
          sprintf(
          '"n_epochs":
          %s
          ',
          jsonlite::toJSON(self$`n_epochs`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FineTuningJobHyperparameters
    #'
    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobHyperparameters
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`n_epochs` <- FineTuningJobHyperparametersNEpochs$new()$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FineTuningJobHyperparameters
    #'
    #' @description
    #' Validate JSON input with respect to FineTuningJobHyperparameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `n_epochs`
      if (!is.null(input_json$`n_epochs`)) {
        stopifnot(R6::is.R6(input_json$`n_epochs`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobHyperparameters: the required field `n_epochs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJobHyperparameters
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
      # check if the required `n_epochs` is null
      if (is.null(self$`n_epochs`)) {
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
      # check if the required `n_epochs` is null
      if (is.null(self$`n_epochs`)) {
        invalid_fields["n_epochs"] <- "Non-nullable required field `n_epochs` cannot be null."
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
# FineTuningJobHyperparameters$unlock()
#
## Below is an example to define the print function
# FineTuningJobHyperparameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJobHyperparameters$lock()


#' Create a new CreateFineTuningJobRequestHyperparameters
#'
#' @description
#' The hyperparameters used for the fine-tuning job.
#'
#' @docType class
#' @title CreateFineTuningJobRequestHyperparameters
#' @description CreateFineTuningJobRequestHyperparameters Class
#' @format An \code{R6Class} generator object
#' @field batch_size  \link{CreateFineTuningJobRequestHyperparametersBatchSize} [optional]
#' @field learning_rate_multiplier  \link{CreateFineTuningJobRequestHyperparametersLearningRateMultiplier} [optional]
#' @field n_epochs  \link{CreateFineTuningJobRequestHyperparametersNEpochs} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateFineTuningJobRequestHyperparameters <- R6::R6Class(
  "CreateFineTuningJobRequestHyperparameters",
  public = list(
    `batch_size` = NULL,
    `learning_rate_multiplier` = NULL,
    `n_epochs` = NULL,

    #' @description
    #' Initialize a new CreateFineTuningJobRequestHyperparameters class.
    #'
    #' @param batch_size batch_size
    #' @param learning_rate_multiplier learning_rate_multiplier
    #' @param n_epochs n_epochs
    #' @param ... Other optional arguments.
    initialize = function(`batch_size` = NULL, `learning_rate_multiplier` = NULL, `n_epochs` = NULL, ...) {
      if (!is.null(`batch_size`)) {
        stopifnot(R6::is.R6(`batch_size`))
        self$`batch_size` <- `batch_size`
      }
      if (!is.null(`learning_rate_multiplier`)) {
        stopifnot(R6::is.R6(`learning_rate_multiplier`))
        self$`learning_rate_multiplier` <- `learning_rate_multiplier`
      }
      if (!is.null(`n_epochs`)) {
        stopifnot(R6::is.R6(`n_epochs`))
        self$`n_epochs` <- `n_epochs`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuningJobRequestHyperparameters in JSON format
    toJSON = function() {
      CreateFineTuningJobRequestHyperparametersObject <- list()
      if (!is.null(self$`batch_size`)) {
        CreateFineTuningJobRequestHyperparametersObject[["batch_size"]] <-
          self$`batch_size`$toJSON()
      }
      if (!is.null(self$`learning_rate_multiplier`)) {
        CreateFineTuningJobRequestHyperparametersObject[["learning_rate_multiplier"]] <-
          self$`learning_rate_multiplier`$toJSON()
      }
      if (!is.null(self$`n_epochs`)) {
        CreateFineTuningJobRequestHyperparametersObject[["n_epochs"]] <-
          self$`n_epochs`$toJSON()
      }
      CreateFineTuningJobRequestHyperparametersObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuningJobRequestHyperparameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`batch_size`)) {
        `batch_size_object` <- CreateFineTuningJobRequestHyperparametersBatchSize$new()
        `batch_size_object`$fromJSON(jsonlite::toJSON(this_object$`batch_size`, auto_unbox = TRUE, digits = NA))
        self$`batch_size` <- `batch_size_object`
      }
      if (!is.null(this_object$`learning_rate_multiplier`)) {
        `learning_rate_multiplier_object` <- CreateFineTuningJobRequestHyperparametersLearningRateMultiplier$new()
        `learning_rate_multiplier_object`$fromJSON(jsonlite::toJSON(this_object$`learning_rate_multiplier`, auto_unbox = TRUE, digits = NA))
        self$`learning_rate_multiplier` <- `learning_rate_multiplier_object`
      }
      if (!is.null(this_object$`n_epochs`)) {
        `n_epochs_object` <- CreateFineTuningJobRequestHyperparametersNEpochs$new()
        `n_epochs_object`$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
        self$`n_epochs` <- `n_epochs_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuningJobRequestHyperparameters in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`batch_size`)) {
          sprintf(
          '"batch_size":
          %s
          ',
          jsonlite::toJSON(self$`batch_size`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`learning_rate_multiplier`)) {
          sprintf(
          '"learning_rate_multiplier":
          %s
          ',
          jsonlite::toJSON(self$`learning_rate_multiplier`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
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

    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuningJobRequestHyperparameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`batch_size` <- CreateFineTuningJobRequestHyperparametersBatchSize$new()$fromJSON(jsonlite::toJSON(this_object$`batch_size`, auto_unbox = TRUE, digits = NA))
      self$`learning_rate_multiplier` <- CreateFineTuningJobRequestHyperparametersLearningRateMultiplier$new()$fromJSON(jsonlite::toJSON(this_object$`learning_rate_multiplier`, auto_unbox = TRUE, digits = NA))
      self$`n_epochs` <- CreateFineTuningJobRequestHyperparametersNEpochs$new()$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateFineTuningJobRequestHyperparameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateFineTuningJobRequestHyperparameters
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# CreateFineTuningJobRequestHyperparameters$unlock()
#
## Below is an example to define the print function
# CreateFineTuningJobRequestHyperparameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateFineTuningJobRequestHyperparameters$lock()


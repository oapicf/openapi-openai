#' Create a new FineTuneSupervisedMethodHyperparameters
#'
#' @description
#' The hyperparameters used for the fine-tuning job.
#'
#' @docType class
#' @title FineTuneSupervisedMethodHyperparameters
#' @description FineTuneSupervisedMethodHyperparameters Class
#' @format An \code{R6Class} generator object
#' @field batch_size  \link{FineTuneDPOMethodHyperparametersBatchSize} [optional]
#' @field learning_rate_multiplier  \link{FineTuneDPOMethodHyperparametersLearningRateMultiplier} [optional]
#' @field n_epochs  \link{FineTuneDPOMethodHyperparametersNEpochs} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneSupervisedMethodHyperparameters <- R6::R6Class(
  "FineTuneSupervisedMethodHyperparameters",
  public = list(
    `batch_size` = NULL,
    `learning_rate_multiplier` = NULL,
    `n_epochs` = NULL,

    #' @description
    #' Initialize a new FineTuneSupervisedMethodHyperparameters class.
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
    #' @return FineTuneSupervisedMethodHyperparameters as a base R list.
    #' @examples
    #' # convert array of FineTuneSupervisedMethodHyperparameters (x) to a data frame
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
    #' Convert FineTuneSupervisedMethodHyperparameters to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuneSupervisedMethodHyperparametersObject <- list()
      if (!is.null(self$`batch_size`)) {
        FineTuneSupervisedMethodHyperparametersObject[["batch_size"]] <-
          self$`batch_size`$toSimpleType()
      }
      if (!is.null(self$`learning_rate_multiplier`)) {
        FineTuneSupervisedMethodHyperparametersObject[["learning_rate_multiplier"]] <-
          self$`learning_rate_multiplier`$toSimpleType()
      }
      if (!is.null(self$`n_epochs`)) {
        FineTuneSupervisedMethodHyperparametersObject[["n_epochs"]] <-
          self$`n_epochs`$toSimpleType()
      }
      return(FineTuneSupervisedMethodHyperparametersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneSupervisedMethodHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneSupervisedMethodHyperparameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`batch_size`)) {
        `batch_size_object` <- FineTuneDPOMethodHyperparametersBatchSize$new()
        `batch_size_object`$fromJSON(jsonlite::toJSON(this_object$`batch_size`, auto_unbox = TRUE, digits = NA))
        self$`batch_size` <- `batch_size_object`
      }
      if (!is.null(this_object$`learning_rate_multiplier`)) {
        `learning_rate_multiplier_object` <- FineTuneDPOMethodHyperparametersLearningRateMultiplier$new()
        `learning_rate_multiplier_object`$fromJSON(jsonlite::toJSON(this_object$`learning_rate_multiplier`, auto_unbox = TRUE, digits = NA))
        self$`learning_rate_multiplier` <- `learning_rate_multiplier_object`
      }
      if (!is.null(this_object$`n_epochs`)) {
        `n_epochs_object` <- FineTuneDPOMethodHyperparametersNEpochs$new()
        `n_epochs_object`$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
        self$`n_epochs` <- `n_epochs_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuneSupervisedMethodHyperparameters in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneSupervisedMethodHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneSupervisedMethodHyperparameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`batch_size` <- FineTuneDPOMethodHyperparametersBatchSize$new()$fromJSON(jsonlite::toJSON(this_object$`batch_size`, auto_unbox = TRUE, digits = NA))
      self$`learning_rate_multiplier` <- FineTuneDPOMethodHyperparametersLearningRateMultiplier$new()$fromJSON(jsonlite::toJSON(this_object$`learning_rate_multiplier`, auto_unbox = TRUE, digits = NA))
      self$`n_epochs` <- FineTuneDPOMethodHyperparametersNEpochs$new()$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuneSupervisedMethodHyperparameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneSupervisedMethodHyperparameters
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
# FineTuneSupervisedMethodHyperparameters$unlock()
#
## Below is an example to define the print function
# FineTuneSupervisedMethodHyperparameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneSupervisedMethodHyperparameters$lock()


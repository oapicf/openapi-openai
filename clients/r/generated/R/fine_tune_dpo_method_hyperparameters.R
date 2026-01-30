#' Create a new FineTuneDPOMethodHyperparameters
#'
#' @description
#' The hyperparameters used for the fine-tuning job.
#'
#' @docType class
#' @title FineTuneDPOMethodHyperparameters
#' @description FineTuneDPOMethodHyperparameters Class
#' @format An \code{R6Class} generator object
#' @field beta  \link{FineTuneDPOMethodHyperparametersBeta} [optional]
#' @field batch_size  \link{FineTuneDPOMethodHyperparametersBatchSize} [optional]
#' @field learning_rate_multiplier  \link{FineTuneDPOMethodHyperparametersLearningRateMultiplier} [optional]
#' @field n_epochs  \link{FineTuneDPOMethodHyperparametersNEpochs} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneDPOMethodHyperparameters <- R6::R6Class(
  "FineTuneDPOMethodHyperparameters",
  public = list(
    `beta` = NULL,
    `batch_size` = NULL,
    `learning_rate_multiplier` = NULL,
    `n_epochs` = NULL,

    #' @description
    #' Initialize a new FineTuneDPOMethodHyperparameters class.
    #'
    #' @param beta beta
    #' @param batch_size batch_size
    #' @param learning_rate_multiplier learning_rate_multiplier
    #' @param n_epochs n_epochs
    #' @param ... Other optional arguments.
    initialize = function(`beta` = NULL, `batch_size` = NULL, `learning_rate_multiplier` = NULL, `n_epochs` = NULL, ...) {
      if (!is.null(`beta`)) {
        stopifnot(R6::is.R6(`beta`))
        self$`beta` <- `beta`
      }
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
    #' @return FineTuneDPOMethodHyperparameters as a base R list.
    #' @examples
    #' # convert array of FineTuneDPOMethodHyperparameters (x) to a data frame
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
    #' Convert FineTuneDPOMethodHyperparameters to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuneDPOMethodHyperparametersObject <- list()
      if (!is.null(self$`beta`)) {
        FineTuneDPOMethodHyperparametersObject[["beta"]] <-
          self$`beta`$toSimpleType()
      }
      if (!is.null(self$`batch_size`)) {
        FineTuneDPOMethodHyperparametersObject[["batch_size"]] <-
          self$`batch_size`$toSimpleType()
      }
      if (!is.null(self$`learning_rate_multiplier`)) {
        FineTuneDPOMethodHyperparametersObject[["learning_rate_multiplier"]] <-
          self$`learning_rate_multiplier`$toSimpleType()
      }
      if (!is.null(self$`n_epochs`)) {
        FineTuneDPOMethodHyperparametersObject[["n_epochs"]] <-
          self$`n_epochs`$toSimpleType()
      }
      return(FineTuneDPOMethodHyperparametersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneDPOMethodHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneDPOMethodHyperparameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`beta`)) {
        `beta_object` <- FineTuneDPOMethodHyperparametersBeta$new()
        `beta_object`$fromJSON(jsonlite::toJSON(this_object$`beta`, auto_unbox = TRUE, digits = NA))
        self$`beta` <- `beta_object`
      }
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
    #' @return FineTuneDPOMethodHyperparameters in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneDPOMethodHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneDPOMethodHyperparameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`beta` <- FineTuneDPOMethodHyperparametersBeta$new()$fromJSON(jsonlite::toJSON(this_object$`beta`, auto_unbox = TRUE, digits = NA))
      self$`batch_size` <- FineTuneDPOMethodHyperparametersBatchSize$new()$fromJSON(jsonlite::toJSON(this_object$`batch_size`, auto_unbox = TRUE, digits = NA))
      self$`learning_rate_multiplier` <- FineTuneDPOMethodHyperparametersLearningRateMultiplier$new()$fromJSON(jsonlite::toJSON(this_object$`learning_rate_multiplier`, auto_unbox = TRUE, digits = NA))
      self$`n_epochs` <- FineTuneDPOMethodHyperparametersNEpochs$new()$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuneDPOMethodHyperparameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneDPOMethodHyperparameters
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
# FineTuneDPOMethodHyperparameters$unlock()
#
## Below is an example to define the print function
# FineTuneDPOMethodHyperparameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneDPOMethodHyperparameters$lock()


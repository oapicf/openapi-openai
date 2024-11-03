#' Create a new FineTuningJobCheckpointMetrics
#'
#' @description
#' Metrics at the step number during the fine-tuning job.
#'
#' @docType class
#' @title FineTuningJobCheckpointMetrics
#' @description FineTuningJobCheckpointMetrics Class
#' @format An \code{R6Class} generator object
#' @field step  numeric [optional]
#' @field train_loss  numeric [optional]
#' @field train_mean_token_accuracy  numeric [optional]
#' @field valid_loss  numeric [optional]
#' @field valid_mean_token_accuracy  numeric [optional]
#' @field full_valid_loss  numeric [optional]
#' @field full_valid_mean_token_accuracy  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJobCheckpointMetrics <- R6::R6Class(
  "FineTuningJobCheckpointMetrics",
  public = list(
    `step` = NULL,
    `train_loss` = NULL,
    `train_mean_token_accuracy` = NULL,
    `valid_loss` = NULL,
    `valid_mean_token_accuracy` = NULL,
    `full_valid_loss` = NULL,
    `full_valid_mean_token_accuracy` = NULL,

    #' @description
    #' Initialize a new FineTuningJobCheckpointMetrics class.
    #'
    #' @param step step
    #' @param train_loss train_loss
    #' @param train_mean_token_accuracy train_mean_token_accuracy
    #' @param valid_loss valid_loss
    #' @param valid_mean_token_accuracy valid_mean_token_accuracy
    #' @param full_valid_loss full_valid_loss
    #' @param full_valid_mean_token_accuracy full_valid_mean_token_accuracy
    #' @param ... Other optional arguments.
    initialize = function(`step` = NULL, `train_loss` = NULL, `train_mean_token_accuracy` = NULL, `valid_loss` = NULL, `valid_mean_token_accuracy` = NULL, `full_valid_loss` = NULL, `full_valid_mean_token_accuracy` = NULL, ...) {
      if (!is.null(`step`)) {
        self$`step` <- `step`
      }
      if (!is.null(`train_loss`)) {
        self$`train_loss` <- `train_loss`
      }
      if (!is.null(`train_mean_token_accuracy`)) {
        self$`train_mean_token_accuracy` <- `train_mean_token_accuracy`
      }
      if (!is.null(`valid_loss`)) {
        self$`valid_loss` <- `valid_loss`
      }
      if (!is.null(`valid_mean_token_accuracy`)) {
        self$`valid_mean_token_accuracy` <- `valid_mean_token_accuracy`
      }
      if (!is.null(`full_valid_loss`)) {
        self$`full_valid_loss` <- `full_valid_loss`
      }
      if (!is.null(`full_valid_mean_token_accuracy`)) {
        self$`full_valid_mean_token_accuracy` <- `full_valid_mean_token_accuracy`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobCheckpointMetrics in JSON format
    toJSON = function() {
      FineTuningJobCheckpointMetricsObject <- list()
      if (!is.null(self$`step`)) {
        FineTuningJobCheckpointMetricsObject[["step"]] <-
          self$`step`
      }
      if (!is.null(self$`train_loss`)) {
        FineTuningJobCheckpointMetricsObject[["train_loss"]] <-
          self$`train_loss`
      }
      if (!is.null(self$`train_mean_token_accuracy`)) {
        FineTuningJobCheckpointMetricsObject[["train_mean_token_accuracy"]] <-
          self$`train_mean_token_accuracy`
      }
      if (!is.null(self$`valid_loss`)) {
        FineTuningJobCheckpointMetricsObject[["valid_loss"]] <-
          self$`valid_loss`
      }
      if (!is.null(self$`valid_mean_token_accuracy`)) {
        FineTuningJobCheckpointMetricsObject[["valid_mean_token_accuracy"]] <-
          self$`valid_mean_token_accuracy`
      }
      if (!is.null(self$`full_valid_loss`)) {
        FineTuningJobCheckpointMetricsObject[["full_valid_loss"]] <-
          self$`full_valid_loss`
      }
      if (!is.null(self$`full_valid_mean_token_accuracy`)) {
        FineTuningJobCheckpointMetricsObject[["full_valid_mean_token_accuracy"]] <-
          self$`full_valid_mean_token_accuracy`
      }
      FineTuningJobCheckpointMetricsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobCheckpointMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobCheckpointMetrics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`step`)) {
        self$`step` <- this_object$`step`
      }
      if (!is.null(this_object$`train_loss`)) {
        self$`train_loss` <- this_object$`train_loss`
      }
      if (!is.null(this_object$`train_mean_token_accuracy`)) {
        self$`train_mean_token_accuracy` <- this_object$`train_mean_token_accuracy`
      }
      if (!is.null(this_object$`valid_loss`)) {
        self$`valid_loss` <- this_object$`valid_loss`
      }
      if (!is.null(this_object$`valid_mean_token_accuracy`)) {
        self$`valid_mean_token_accuracy` <- this_object$`valid_mean_token_accuracy`
      }
      if (!is.null(this_object$`full_valid_loss`)) {
        self$`full_valid_loss` <- this_object$`full_valid_loss`
      }
      if (!is.null(this_object$`full_valid_mean_token_accuracy`)) {
        self$`full_valid_mean_token_accuracy` <- this_object$`full_valid_mean_token_accuracy`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobCheckpointMetrics in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`step`)) {
          sprintf(
          '"step":
            %d
                    ',
          self$`step`
          )
        },
        if (!is.null(self$`train_loss`)) {
          sprintf(
          '"train_loss":
            %d
                    ',
          self$`train_loss`
          )
        },
        if (!is.null(self$`train_mean_token_accuracy`)) {
          sprintf(
          '"train_mean_token_accuracy":
            %d
                    ',
          self$`train_mean_token_accuracy`
          )
        },
        if (!is.null(self$`valid_loss`)) {
          sprintf(
          '"valid_loss":
            %d
                    ',
          self$`valid_loss`
          )
        },
        if (!is.null(self$`valid_mean_token_accuracy`)) {
          sprintf(
          '"valid_mean_token_accuracy":
            %d
                    ',
          self$`valid_mean_token_accuracy`
          )
        },
        if (!is.null(self$`full_valid_loss`)) {
          sprintf(
          '"full_valid_loss":
            %d
                    ',
          self$`full_valid_loss`
          )
        },
        if (!is.null(self$`full_valid_mean_token_accuracy`)) {
          sprintf(
          '"full_valid_mean_token_accuracy":
            %d
                    ',
          self$`full_valid_mean_token_accuracy`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobCheckpointMetrics
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobCheckpointMetrics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`step` <- this_object$`step`
      self$`train_loss` <- this_object$`train_loss`
      self$`train_mean_token_accuracy` <- this_object$`train_mean_token_accuracy`
      self$`valid_loss` <- this_object$`valid_loss`
      self$`valid_mean_token_accuracy` <- this_object$`valid_mean_token_accuracy`
      self$`full_valid_loss` <- this_object$`full_valid_loss`
      self$`full_valid_mean_token_accuracy` <- this_object$`full_valid_mean_token_accuracy`
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningJobCheckpointMetrics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJobCheckpointMetrics
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
# FineTuningJobCheckpointMetrics$unlock()
#
## Below is an example to define the print function
# FineTuningJobCheckpointMetrics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJobCheckpointMetrics$lock()


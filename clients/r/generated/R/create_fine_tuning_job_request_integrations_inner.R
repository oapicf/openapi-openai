#' Create a new CreateFineTuningJobRequestIntegrationsInner
#'
#' @description
#' CreateFineTuningJobRequestIntegrationsInner Class
#'
#' @docType class
#' @title CreateFineTuningJobRequestIntegrationsInner
#' @description CreateFineTuningJobRequestIntegrationsInner Class
#' @format An \code{R6Class} generator object
#' @field type  \link{CreateFineTuningJobRequestIntegrationsInnerType}
#' @field wandb  \link{CreateFineTuningJobRequestIntegrationsInnerWandb}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateFineTuningJobRequestIntegrationsInner <- R6::R6Class(
  "CreateFineTuningJobRequestIntegrationsInner",
  public = list(
    `type` = NULL,
    `wandb` = NULL,
    #' Initialize a new CreateFineTuningJobRequestIntegrationsInner class.
    #'
    #' @description
    #' Initialize a new CreateFineTuningJobRequestIntegrationsInner class.
    #'
    #' @param type type
    #' @param wandb wandb
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `wandb`, ...) {
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`wandb`)) {
        stopifnot(R6::is.R6(`wandb`))
        self$`wandb` <- `wandb`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuningJobRequestIntegrationsInner in JSON format
    #' @export
    toJSON = function() {
      CreateFineTuningJobRequestIntegrationsInnerObject <- list()
      if (!is.null(self$`type`)) {
        CreateFineTuningJobRequestIntegrationsInnerObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`wandb`)) {
        CreateFineTuningJobRequestIntegrationsInnerObject[["wandb"]] <-
          self$`wandb`$toJSON()
      }
      CreateFineTuningJobRequestIntegrationsInnerObject
    },
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuningJobRequestIntegrationsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- CreateFineTuningJobRequestIntegrationsInnerType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`wandb`)) {
        `wandb_object` <- CreateFineTuningJobRequestIntegrationsInnerWandb$new()
        `wandb_object`$fromJSON(jsonlite::toJSON(this_object$`wandb`, auto_unbox = TRUE, digits = NA))
        self$`wandb` <- `wandb_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuningJobRequestIntegrationsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`wandb`)) {
          sprintf(
          '"wandb":
          %s
          ',
          jsonlite::toJSON(self$`wandb`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuningJobRequestIntegrationsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- CreateFineTuningJobRequestIntegrationsInnerType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`wandb` <- CreateFineTuningJobRequestIntegrationsInnerWandb$new()$fromJSON(jsonlite::toJSON(this_object$`wandb`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CreateFineTuningJobRequestIntegrationsInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateFineTuningJobRequestIntegrationsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateFineTuningJobRequestIntegrationsInner: the required field `type` is missing."))
      }
      # check the required field `wandb`
      if (!is.null(input_json$`wandb`)) {
        stopifnot(R6::is.R6(input_json$`wandb`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateFineTuningJobRequestIntegrationsInner: the required field `wandb` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateFineTuningJobRequestIntegrationsInner
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

      # check if the required `wandb` is null
      if (is.null(self$`wandb`)) {
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

      # check if the required `wandb` is null
      if (is.null(self$`wandb`)) {
        invalid_fields["wandb"] <- "Non-nullable required field `wandb` cannot be null."
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
# CreateFineTuningJobRequestIntegrationsInner$unlock()
#
## Below is an example to define the print function
# CreateFineTuningJobRequestIntegrationsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateFineTuningJobRequestIntegrationsInner$lock()


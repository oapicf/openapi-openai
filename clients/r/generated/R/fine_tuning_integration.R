#' Create a new FineTuningIntegration
#'
#' @description
#' FineTuningIntegration Class
#'
#' @docType class
#' @title FineTuningIntegration
#' @description FineTuningIntegration Class
#' @format An \code{R6Class} generator object
#' @field type The type of the integration being enabled for the fine-tuning job character
#' @field wandb  \link{CreateFineTuningJobRequestIntegrationsInnerWandb}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningIntegration <- R6::R6Class(
  "FineTuningIntegration",
  public = list(
    `type` = NULL,
    `wandb` = NULL,

    #' @description
    #' Initialize a new FineTuningIntegration class.
    #'
    #' @param type The type of the integration being enabled for the fine-tuning job
    #' @param wandb wandb
    #' @param ... Other optional arguments.
    initialize = function(`type`, `wandb`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("wandb"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"wandb\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`wandb`)) {
        stopifnot(R6::is.R6(`wandb`))
        self$`wandb` <- `wandb`
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
    #' @return FineTuningIntegration as a base R list.
    #' @examples
    #' # convert array of FineTuningIntegration (x) to a data frame
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
    #' Convert FineTuningIntegration to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuningIntegrationObject <- list()
      if (!is.null(self$`type`)) {
        FineTuningIntegrationObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`wandb`)) {
        FineTuningIntegrationObject[["wandb"]] <-
          self$`wandb`$toSimpleType()
      }
      return(FineTuningIntegrationObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningIntegration
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningIntegration
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("wandb"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"wandb\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`wandb`)) {
        `wandb_object` <- CreateFineTuningJobRequestIntegrationsInnerWandb$new()
        `wandb_object`$fromJSON(jsonlite::toJSON(this_object$`wandb`, auto_unbox = TRUE, digits = NA))
        self$`wandb` <- `wandb_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuningIntegration in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningIntegration
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningIntegration
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("wandb"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"wandb\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`wandb` <- CreateFineTuningJobRequestIntegrationsInnerWandb$new()$fromJSON(jsonlite::toJSON(this_object$`wandb`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningIntegration and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for FineTuningIntegration: the required field `type` is missing."))
      }
      # check the required field `wandb`
      if (!is.null(input_json$`wandb`)) {
        stopifnot(R6::is.R6(input_json$`wandb`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningIntegration: the required field `wandb` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningIntegration
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

      # check if the required `wandb` is null
      if (is.null(self$`wandb`)) {
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

      # check if the required `wandb` is null
      if (is.null(self$`wandb`)) {
        invalid_fields["wandb"] <- "Non-nullable required field `wandb` cannot be null."
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
# FineTuningIntegration$unlock()
#
## Below is an example to define the print function
# FineTuningIntegration$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningIntegration$lock()


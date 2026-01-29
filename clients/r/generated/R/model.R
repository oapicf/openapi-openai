#' Create a new Model
#'
#' @description
#' Describes an OpenAI model offering that can be used with the API.
#'
#' @docType class
#' @title Model
#' @description Model Class
#' @format An \code{R6Class} generator object
#' @field id The model identifier, which can be referenced in the API endpoints. character
#' @field created The Unix timestamp (in seconds) when the model was created. integer
#' @field object The object type, which is always \"model\". character
#' @field owned_by The organization that owns the model. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Model <- R6::R6Class(
  "Model",
  public = list(
    `id` = NULL,
    `created` = NULL,
    `object` = NULL,
    `owned_by` = NULL,

    #' @description
    #' Initialize a new Model class.
    #'
    #' @param id The model identifier, which can be referenced in the API endpoints.
    #' @param created The Unix timestamp (in seconds) when the model was created.
    #' @param object The object type, which is always \"model\".
    #' @param owned_by The organization that owns the model.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `created`, `object`, `owned_by`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`created`)) {
        if (!(is.numeric(`created`) && length(`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", `created`))
        }
        self$`created` <- `created`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("model"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"model\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`owned_by`)) {
        if (!(is.character(`owned_by`) && length(`owned_by`) == 1)) {
          stop(paste("Error! Invalid data for `owned_by`. Must be a string:", `owned_by`))
        }
        self$`owned_by` <- `owned_by`
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
    #' @return Model as a base R list.
    #' @examples
    #' # convert array of Model (x) to a data frame
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
    #' Convert Model to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ModelObject <- list()
      if (!is.null(self$`id`)) {
        ModelObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created`)) {
        ModelObject[["created"]] <-
          self$`created`
      }
      if (!is.null(self$`object`)) {
        ModelObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`owned_by`)) {
        ModelObject[["owned_by"]] <-
          self$`owned_by`
      }
      return(ModelObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Model
    #'
    #' @param input_json the JSON input
    #' @return the instance of Model
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created`)) {
        self$`created` <- this_object$`created`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("model"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"model\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`owned_by`)) {
        self$`owned_by` <- this_object$`owned_by`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Model in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Model
    #'
    #' @param input_json the JSON input
    #' @return the instance of Model
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created` <- this_object$`created`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("model"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"model\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`owned_by` <- this_object$`owned_by`
      self
    },

    #' @description
    #' Validate JSON input with respect to Model and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `id` is missing."))
      }
      # check the required field `created`
      if (!is.null(input_json$`created`)) {
        if (!(is.numeric(input_json$`created`) && length(input_json$`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", input_json$`created`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `created` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `object` is missing."))
      }
      # check the required field `owned_by`
      if (!is.null(input_json$`owned_by`)) {
        if (!(is.character(input_json$`owned_by`) && length(input_json$`owned_by`) == 1)) {
          stop(paste("Error! Invalid data for `owned_by`. Must be a string:", input_json$`owned_by`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `owned_by` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Model
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `owned_by` is null
      if (is.null(self$`owned_by`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        invalid_fields["created"] <- "Non-nullable required field `created` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `owned_by` is null
      if (is.null(self$`owned_by`)) {
        invalid_fields["owned_by"] <- "Non-nullable required field `owned_by` cannot be null."
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
# Model$unlock()
#
## Below is an example to define the print function
# Model$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Model$lock()


#' Create a new UsageImagesResult
#'
#' @description
#' The aggregated images usage details of the specific time bucket.
#'
#' @docType class
#' @title UsageImagesResult
#' @description UsageImagesResult Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field images The number of images processed. integer
#' @field num_model_requests The count of requests made to the model. integer
#' @field source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. character [optional]
#' @field size When `group_by=size`, this field provides the image size of the grouped usage result. character [optional]
#' @field project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result. character [optional]
#' @field user_id When `group_by=user_id`, this field provides the user ID of the grouped usage result. character [optional]
#' @field api_key_id When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. character [optional]
#' @field model When `group_by=model`, this field provides the model name of the grouped usage result. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageImagesResult <- R6::R6Class(
  "UsageImagesResult",
  public = list(
    `object` = NULL,
    `images` = NULL,
    `num_model_requests` = NULL,
    `source` = NULL,
    `size` = NULL,
    `project_id` = NULL,
    `user_id` = NULL,
    `api_key_id` = NULL,
    `model` = NULL,

    #' @description
    #' Initialize a new UsageImagesResult class.
    #'
    #' @param object object
    #' @param images The number of images processed.
    #' @param num_model_requests The count of requests made to the model.
    #' @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
    #' @param size When `group_by=size`, this field provides the image size of the grouped usage result.
    #' @param project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    #' @param user_id When `group_by=user_id`, this field provides the user ID of the grouped usage result.
    #' @param api_key_id When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
    #' @param model When `group_by=model`, this field provides the model name of the grouped usage result.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `images`, `num_model_requests`, `source` = NULL, `size` = NULL, `project_id` = NULL, `user_id` = NULL, `api_key_id` = NULL, `model` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.usage.images.result"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.usage.images.result\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`images`)) {
        if (!(is.numeric(`images`) && length(`images`) == 1)) {
          stop(paste("Error! Invalid data for `images`. Must be an integer:", `images`))
        }
        self$`images` <- `images`
      }
      if (!missing(`num_model_requests`)) {
        if (!(is.numeric(`num_model_requests`) && length(`num_model_requests`) == 1)) {
          stop(paste("Error! Invalid data for `num_model_requests`. Must be an integer:", `num_model_requests`))
        }
        self$`num_model_requests` <- `num_model_requests`
      }
      if (!is.null(`source`)) {
        if (!(is.character(`source`) && length(`source`) == 1)) {
          stop(paste("Error! Invalid data for `source`. Must be a string:", `source`))
        }
        self$`source` <- `source`
      }
      if (!is.null(`size`)) {
        if (!(is.character(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be a string:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`project_id`)) {
        if (!(is.character(`project_id`) && length(`project_id`) == 1)) {
          stop(paste("Error! Invalid data for `project_id`. Must be a string:", `project_id`))
        }
        self$`project_id` <- `project_id`
      }
      if (!is.null(`user_id`)) {
        if (!(is.character(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", `user_id`))
        }
        self$`user_id` <- `user_id`
      }
      if (!is.null(`api_key_id`)) {
        if (!(is.character(`api_key_id`) && length(`api_key_id`) == 1)) {
          stop(paste("Error! Invalid data for `api_key_id`. Must be a string:", `api_key_id`))
        }
        self$`api_key_id` <- `api_key_id`
      }
      if (!is.null(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
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
    #' @return UsageImagesResult as a base R list.
    #' @examples
    #' # convert array of UsageImagesResult (x) to a data frame
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
    #' Convert UsageImagesResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageImagesResultObject <- list()
      if (!is.null(self$`object`)) {
        UsageImagesResultObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`images`)) {
        UsageImagesResultObject[["images"]] <-
          self$`images`
      }
      if (!is.null(self$`num_model_requests`)) {
        UsageImagesResultObject[["num_model_requests"]] <-
          self$`num_model_requests`
      }
      if (!is.null(self$`source`)) {
        UsageImagesResultObject[["source"]] <-
          self$`source`
      }
      if (!is.null(self$`size`)) {
        UsageImagesResultObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`project_id`)) {
        UsageImagesResultObject[["project_id"]] <-
          self$`project_id`
      }
      if (!is.null(self$`user_id`)) {
        UsageImagesResultObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`api_key_id`)) {
        UsageImagesResultObject[["api_key_id"]] <-
          self$`api_key_id`
      }
      if (!is.null(self$`model`)) {
        UsageImagesResultObject[["model"]] <-
          self$`model`
      }
      return(UsageImagesResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageImagesResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageImagesResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.images.result"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.images.result\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`images`)) {
        self$`images` <- this_object$`images`
      }
      if (!is.null(this_object$`num_model_requests`)) {
        self$`num_model_requests` <- this_object$`num_model_requests`
      }
      if (!is.null(this_object$`source`)) {
        self$`source` <- this_object$`source`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`project_id`)) {
        self$`project_id` <- this_object$`project_id`
      }
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      if (!is.null(this_object$`api_key_id`)) {
        self$`api_key_id` <- this_object$`api_key_id`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UsageImagesResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageImagesResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageImagesResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.images.result"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.images.result\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`images` <- this_object$`images`
      self$`num_model_requests` <- this_object$`num_model_requests`
      self$`source` <- this_object$`source`
      self$`size` <- this_object$`size`
      self$`project_id` <- this_object$`project_id`
      self$`user_id` <- this_object$`user_id`
      self$`api_key_id` <- this_object$`api_key_id`
      self$`model` <- this_object$`model`
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageImagesResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageImagesResult: the required field `object` is missing."))
      }
      # check the required field `images`
      if (!is.null(input_json$`images`)) {
        if (!(is.numeric(input_json$`images`) && length(input_json$`images`) == 1)) {
          stop(paste("Error! Invalid data for `images`. Must be an integer:", input_json$`images`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageImagesResult: the required field `images` is missing."))
      }
      # check the required field `num_model_requests`
      if (!is.null(input_json$`num_model_requests`)) {
        if (!(is.numeric(input_json$`num_model_requests`) && length(input_json$`num_model_requests`) == 1)) {
          stop(paste("Error! Invalid data for `num_model_requests`. Must be an integer:", input_json$`num_model_requests`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageImagesResult: the required field `num_model_requests` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageImagesResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `images` is null
      if (is.null(self$`images`)) {
        return(FALSE)
      }

      # check if the required `num_model_requests` is null
      if (is.null(self$`num_model_requests`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `images` is null
      if (is.null(self$`images`)) {
        invalid_fields["images"] <- "Non-nullable required field `images` cannot be null."
      }

      # check if the required `num_model_requests` is null
      if (is.null(self$`num_model_requests`)) {
        invalid_fields["num_model_requests"] <- "Non-nullable required field `num_model_requests` cannot be null."
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
# UsageImagesResult$unlock()
#
## Below is an example to define the print function
# UsageImagesResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageImagesResult$lock()


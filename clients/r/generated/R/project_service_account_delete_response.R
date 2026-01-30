#' Create a new ProjectServiceAccountDeleteResponse
#'
#' @description
#' ProjectServiceAccountDeleteResponse Class
#'
#' @docType class
#' @title ProjectServiceAccountDeleteResponse
#' @description ProjectServiceAccountDeleteResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field id  character
#' @field deleted  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectServiceAccountDeleteResponse <- R6::R6Class(
  "ProjectServiceAccountDeleteResponse",
  public = list(
    `object` = NULL,
    `id` = NULL,
    `deleted` = NULL,

    #' @description
    #' Initialize a new ProjectServiceAccountDeleteResponse class.
    #'
    #' @param object object
    #' @param id id
    #' @param deleted deleted
    #' @param ... Other optional arguments.
    initialize = function(`object`, `id`, `deleted`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.project.service_account.deleted"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account.deleted\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`deleted`)) {
        if (!(is.logical(`deleted`) && length(`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", `deleted`))
        }
        self$`deleted` <- `deleted`
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
    #' @return ProjectServiceAccountDeleteResponse as a base R list.
    #' @examples
    #' # convert array of ProjectServiceAccountDeleteResponse (x) to a data frame
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
    #' Convert ProjectServiceAccountDeleteResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectServiceAccountDeleteResponseObject <- list()
      if (!is.null(self$`object`)) {
        ProjectServiceAccountDeleteResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`id`)) {
        ProjectServiceAccountDeleteResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`deleted`)) {
        ProjectServiceAccountDeleteResponseObject[["deleted"]] <-
          self$`deleted`
      }
      return(ProjectServiceAccountDeleteResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectServiceAccountDeleteResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectServiceAccountDeleteResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.service_account.deleted"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account.deleted\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`deleted`)) {
        self$`deleted` <- this_object$`deleted`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectServiceAccountDeleteResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectServiceAccountDeleteResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectServiceAccountDeleteResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.service_account.deleted"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account.deleted\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`id` <- this_object$`id`
      self$`deleted` <- this_object$`deleted`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectServiceAccountDeleteResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountDeleteResponse: the required field `object` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountDeleteResponse: the required field `id` is missing."))
      }
      # check the required field `deleted`
      if (!is.null(input_json$`deleted`)) {
        if (!(is.logical(input_json$`deleted`) && length(input_json$`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", input_json$`deleted`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountDeleteResponse: the required field `deleted` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectServiceAccountDeleteResponse
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `deleted` is null
      if (is.null(self$`deleted`)) {
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `deleted` is null
      if (is.null(self$`deleted`)) {
        invalid_fields["deleted"] <- "Non-nullable required field `deleted` cannot be null."
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
# ProjectServiceAccountDeleteResponse$unlock()
#
## Below is an example to define the print function
# ProjectServiceAccountDeleteResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectServiceAccountDeleteResponse$lock()


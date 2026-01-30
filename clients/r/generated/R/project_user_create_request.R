#' Create a new ProjectUserCreateRequest
#'
#' @description
#' ProjectUserCreateRequest Class
#'
#' @docType class
#' @title ProjectUserCreateRequest
#' @description ProjectUserCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field user_id The ID of the user. character
#' @field role `owner` or `member` character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectUserCreateRequest <- R6::R6Class(
  "ProjectUserCreateRequest",
  public = list(
    `user_id` = NULL,
    `role` = NULL,

    #' @description
    #' Initialize a new ProjectUserCreateRequest class.
    #'
    #' @param user_id The ID of the user.
    #' @param role `owner` or `member`
    #' @param ... Other optional arguments.
    initialize = function(`user_id`, `role`, ...) {
      if (!missing(`user_id`)) {
        if (!(is.character(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", `user_id`))
        }
        self$`user_id` <- `user_id`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("owner", "member"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"owner\", \"member\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
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
    #' @return ProjectUserCreateRequest as a base R list.
    #' @examples
    #' # convert array of ProjectUserCreateRequest (x) to a data frame
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
    #' Convert ProjectUserCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectUserCreateRequestObject <- list()
      if (!is.null(self$`user_id`)) {
        ProjectUserCreateRequestObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`role`)) {
        ProjectUserCreateRequestObject[["role"]] <-
          self$`role`
      }
      return(ProjectUserCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectUserCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectUserCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("owner", "member"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"owner\", \"member\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectUserCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectUserCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectUserCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`user_id` <- this_object$`user_id`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("owner", "member"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"owner\", \"member\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectUserCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `user_id`
      if (!is.null(input_json$`user_id`)) {
        if (!(is.character(input_json$`user_id`) && length(input_json$`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", input_json$`user_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectUserCreateRequest: the required field `user_id` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectUserCreateRequest: the required field `role` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectUserCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `user_id` is null
      if (is.null(self$`user_id`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
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
      # check if the required `user_id` is null
      if (is.null(self$`user_id`)) {
        invalid_fields["user_id"] <- "Non-nullable required field `user_id` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
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
# ProjectUserCreateRequest$unlock()
#
## Below is an example to define the print function
# ProjectUserCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectUserCreateRequest$lock()


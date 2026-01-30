#' Create a new InviteRequestProjectsInner
#'
#' @description
#' InviteRequestProjectsInner Class
#'
#' @docType class
#' @title InviteRequestProjectsInner
#' @description InviteRequestProjectsInner Class
#' @format An \code{R6Class} generator object
#' @field id Project's public ID character
#' @field role Project membership role character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteRequestProjectsInner <- R6::R6Class(
  "InviteRequestProjectsInner",
  public = list(
    `id` = NULL,
    `role` = NULL,

    #' @description
    #' Initialize a new InviteRequestProjectsInner class.
    #'
    #' @param id Project's public ID
    #' @param role Project membership role
    #' @param ... Other optional arguments.
    initialize = function(`id`, `role`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("member", "owner"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"member\", \"owner\".", sep = ""))
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
    #' @return InviteRequestProjectsInner as a base R list.
    #' @examples
    #' # convert array of InviteRequestProjectsInner (x) to a data frame
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
    #' Convert InviteRequestProjectsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteRequestProjectsInnerObject <- list()
      if (!is.null(self$`id`)) {
        InviteRequestProjectsInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`role`)) {
        InviteRequestProjectsInnerObject[["role"]] <-
          self$`role`
      }
      return(InviteRequestProjectsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteRequestProjectsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteRequestProjectsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("member", "owner"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"member\", \"owner\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteRequestProjectsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteRequestProjectsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteRequestProjectsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("member", "owner"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"member\", \"owner\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteRequestProjectsInner and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for InviteRequestProjectsInner: the required field `id` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for InviteRequestProjectsInner: the required field `role` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteRequestProjectsInner
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
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
# InviteRequestProjectsInner$unlock()
#
## Below is an example to define the print function
# InviteRequestProjectsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteRequestProjectsInner$lock()


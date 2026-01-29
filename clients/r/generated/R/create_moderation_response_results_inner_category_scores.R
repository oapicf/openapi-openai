#' Create a new CreateModerationResponseResultsInnerCategoryScores
#'
#' @description
#' A list of the categories along with their scores as predicted by model.
#'
#' @docType class
#' @title CreateModerationResponseResultsInnerCategoryScores
#' @description CreateModerationResponseResultsInnerCategoryScores Class
#' @format An \code{R6Class} generator object
#' @field hate The score for the category 'hate'. numeric
#' @field hate/threatening The score for the category 'hate/threatening'. numeric
#' @field harassment The score for the category 'harassment'. numeric
#' @field harassment/threatening The score for the category 'harassment/threatening'. numeric
#' @field self-harm The score for the category 'self-harm'. numeric
#' @field self-harm/intent The score for the category 'self-harm/intent'. numeric
#' @field self-harm/instructions The score for the category 'self-harm/instructions'. numeric
#' @field sexual The score for the category 'sexual'. numeric
#' @field sexual/minors The score for the category 'sexual/minors'. numeric
#' @field violence The score for the category 'violence'. numeric
#' @field violence/graphic The score for the category 'violence/graphic'. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInnerCategoryScores <- R6::R6Class(
  "CreateModerationResponseResultsInnerCategoryScores",
  public = list(
    `hate` = NULL,
    `hate/threatening` = NULL,
    `harassment` = NULL,
    `harassment/threatening` = NULL,
    `self-harm` = NULL,
    `self-harm/intent` = NULL,
    `self-harm/instructions` = NULL,
    `sexual` = NULL,
    `sexual/minors` = NULL,
    `violence` = NULL,
    `violence/graphic` = NULL,

    #' @description
    #' Initialize a new CreateModerationResponseResultsInnerCategoryScores class.
    #'
    #' @param hate The score for the category 'hate'.
    #' @param hate/threatening The score for the category 'hate/threatening'.
    #' @param harassment The score for the category 'harassment'.
    #' @param harassment/threatening The score for the category 'harassment/threatening'.
    #' @param self-harm The score for the category 'self-harm'.
    #' @param self-harm/intent The score for the category 'self-harm/intent'.
    #' @param self-harm/instructions The score for the category 'self-harm/instructions'.
    #' @param sexual The score for the category 'sexual'.
    #' @param sexual/minors The score for the category 'sexual/minors'.
    #' @param violence The score for the category 'violence'.
    #' @param violence/graphic The score for the category 'violence/graphic'.
    #' @param ... Other optional arguments.
    initialize = function(`hate`, `hate/threatening`, `harassment`, `harassment/threatening`, `self-harm`, `self-harm/intent`, `self-harm/instructions`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`, ...) {
      if (!missing(`hate`)) {
        self$`hate` <- `hate`
      }
      if (!missing(`hate/threatening`)) {
        self$`hate/threatening` <- `hate/threatening`
      }
      if (!missing(`harassment`)) {
        self$`harassment` <- `harassment`
      }
      if (!missing(`harassment/threatening`)) {
        self$`harassment/threatening` <- `harassment/threatening`
      }
      if (!missing(`self-harm`)) {
        self$`self-harm` <- `self-harm`
      }
      if (!missing(`self-harm/intent`)) {
        self$`self-harm/intent` <- `self-harm/intent`
      }
      if (!missing(`self-harm/instructions`)) {
        self$`self-harm/instructions` <- `self-harm/instructions`
      }
      if (!missing(`sexual`)) {
        self$`sexual` <- `sexual`
      }
      if (!missing(`sexual/minors`)) {
        self$`sexual/minors` <- `sexual/minors`
      }
      if (!missing(`violence`)) {
        self$`violence` <- `violence`
      }
      if (!missing(`violence/graphic`)) {
        self$`violence/graphic` <- `violence/graphic`
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
    #' @return CreateModerationResponseResultsInnerCategoryScores as a base R list.
    #' @examples
    #' # convert array of CreateModerationResponseResultsInnerCategoryScores (x) to a data frame
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
    #' Convert CreateModerationResponseResultsInnerCategoryScores to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateModerationResponseResultsInnerCategoryScoresObject <- list()
      if (!is.null(self$`hate`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["hate"]] <-
          self$`hate`
      }
      if (!is.null(self$`hate/threatening`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["hate/threatening"]] <-
          self$`hate/threatening`
      }
      if (!is.null(self$`harassment`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["harassment"]] <-
          self$`harassment`
      }
      if (!is.null(self$`harassment/threatening`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["harassment/threatening"]] <-
          self$`harassment/threatening`
      }
      if (!is.null(self$`self-harm`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["self-harm"]] <-
          self$`self-harm`
      }
      if (!is.null(self$`self-harm/intent`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["self-harm/intent"]] <-
          self$`self-harm/intent`
      }
      if (!is.null(self$`self-harm/instructions`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["self-harm/instructions"]] <-
          self$`self-harm/instructions`
      }
      if (!is.null(self$`sexual`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["sexual"]] <-
          self$`sexual`
      }
      if (!is.null(self$`sexual/minors`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["sexual/minors"]] <-
          self$`sexual/minors`
      }
      if (!is.null(self$`violence`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["violence"]] <-
          self$`violence`
      }
      if (!is.null(self$`violence/graphic`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["violence/graphic"]] <-
          self$`violence/graphic`
      }
      return(CreateModerationResponseResultsInnerCategoryScoresObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategoryScores
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hate`)) {
        self$`hate` <- this_object$`hate`
      }
      if (!is.null(this_object$`hate/threatening`)) {
        self$`hate/threatening` <- this_object$`hate/threatening`
      }
      if (!is.null(this_object$`harassment`)) {
        self$`harassment` <- this_object$`harassment`
      }
      if (!is.null(this_object$`harassment/threatening`)) {
        self$`harassment/threatening` <- this_object$`harassment/threatening`
      }
      if (!is.null(this_object$`self-harm`)) {
        self$`self-harm` <- this_object$`self-harm`
      }
      if (!is.null(this_object$`self-harm/intent`)) {
        self$`self-harm/intent` <- this_object$`self-harm/intent`
      }
      if (!is.null(this_object$`self-harm/instructions`)) {
        self$`self-harm/instructions` <- this_object$`self-harm/instructions`
      }
      if (!is.null(this_object$`sexual`)) {
        self$`sexual` <- this_object$`sexual`
      }
      if (!is.null(this_object$`sexual/minors`)) {
        self$`sexual/minors` <- this_object$`sexual/minors`
      }
      if (!is.null(this_object$`violence`)) {
        self$`violence` <- this_object$`violence`
      }
      if (!is.null(this_object$`violence/graphic`)) {
        self$`violence/graphic` <- this_object$`violence/graphic`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateModerationResponseResultsInnerCategoryScores in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategoryScores
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hate` <- this_object$`hate`
      self$`hate/threatening` <- this_object$`hate/threatening`
      self$`harassment` <- this_object$`harassment`
      self$`harassment/threatening` <- this_object$`harassment/threatening`
      self$`self-harm` <- this_object$`self-harm`
      self$`self-harm/intent` <- this_object$`self-harm/intent`
      self$`self-harm/instructions` <- this_object$`self-harm/instructions`
      self$`sexual` <- this_object$`sexual`
      self$`sexual/minors` <- this_object$`sexual/minors`
      self$`violence` <- this_object$`violence`
      self$`violence/graphic` <- this_object$`violence/graphic`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategoryScores and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hate`
      if (!is.null(input_json$`hate`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `hate` is missing."))
      }
      # check the required field `hate/threatening`
      if (!is.null(input_json$`hate/threatening`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `hate/threatening` is missing."))
      }
      # check the required field `harassment`
      if (!is.null(input_json$`harassment`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `harassment` is missing."))
      }
      # check the required field `harassment/threatening`
      if (!is.null(input_json$`harassment/threatening`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `harassment/threatening` is missing."))
      }
      # check the required field `self-harm`
      if (!is.null(input_json$`self-harm`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `self-harm` is missing."))
      }
      # check the required field `self-harm/intent`
      if (!is.null(input_json$`self-harm/intent`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `self-harm/intent` is missing."))
      }
      # check the required field `self-harm/instructions`
      if (!is.null(input_json$`self-harm/instructions`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `self-harm/instructions` is missing."))
      }
      # check the required field `sexual`
      if (!is.null(input_json$`sexual`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `sexual` is missing."))
      }
      # check the required field `sexual/minors`
      if (!is.null(input_json$`sexual/minors`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `sexual/minors` is missing."))
      }
      # check the required field `violence`
      if (!is.null(input_json$`violence`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `violence` is missing."))
      }
      # check the required field `violence/graphic`
      if (!is.null(input_json$`violence/graphic`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `violence/graphic` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInnerCategoryScores
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        return(FALSE)
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        return(FALSE)
      }

      # check if the required `harassment` is null
      if (is.null(self$`harassment`)) {
        return(FALSE)
      }

      # check if the required `harassment/threatening` is null
      if (is.null(self$`harassment/threatening`)) {
        return(FALSE)
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        return(FALSE)
      }

      # check if the required `self-harm/intent` is null
      if (is.null(self$`self-harm/intent`)) {
        return(FALSE)
      }

      # check if the required `self-harm/instructions` is null
      if (is.null(self$`self-harm/instructions`)) {
        return(FALSE)
      }

      # check if the required `sexual` is null
      if (is.null(self$`sexual`)) {
        return(FALSE)
      }

      # check if the required `sexual/minors` is null
      if (is.null(self$`sexual/minors`)) {
        return(FALSE)
      }

      # check if the required `violence` is null
      if (is.null(self$`violence`)) {
        return(FALSE)
      }

      # check if the required `violence/graphic` is null
      if (is.null(self$`violence/graphic`)) {
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
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        invalid_fields["hate"] <- "Non-nullable required field `hate` cannot be null."
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        invalid_fields["hate/threatening"] <- "Non-nullable required field `hate/threatening` cannot be null."
      }

      # check if the required `harassment` is null
      if (is.null(self$`harassment`)) {
        invalid_fields["harassment"] <- "Non-nullable required field `harassment` cannot be null."
      }

      # check if the required `harassment/threatening` is null
      if (is.null(self$`harassment/threatening`)) {
        invalid_fields["harassment/threatening"] <- "Non-nullable required field `harassment/threatening` cannot be null."
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        invalid_fields["self-harm"] <- "Non-nullable required field `self-harm` cannot be null."
      }

      # check if the required `self-harm/intent` is null
      if (is.null(self$`self-harm/intent`)) {
        invalid_fields["self-harm/intent"] <- "Non-nullable required field `self-harm/intent` cannot be null."
      }

      # check if the required `self-harm/instructions` is null
      if (is.null(self$`self-harm/instructions`)) {
        invalid_fields["self-harm/instructions"] <- "Non-nullable required field `self-harm/instructions` cannot be null."
      }

      # check if the required `sexual` is null
      if (is.null(self$`sexual`)) {
        invalid_fields["sexual"] <- "Non-nullable required field `sexual` cannot be null."
      }

      # check if the required `sexual/minors` is null
      if (is.null(self$`sexual/minors`)) {
        invalid_fields["sexual/minors"] <- "Non-nullable required field `sexual/minors` cannot be null."
      }

      # check if the required `violence` is null
      if (is.null(self$`violence`)) {
        invalid_fields["violence"] <- "Non-nullable required field `violence` cannot be null."
      }

      # check if the required `violence/graphic` is null
      if (is.null(self$`violence/graphic`)) {
        invalid_fields["violence/graphic"] <- "Non-nullable required field `violence/graphic` cannot be null."
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
# CreateModerationResponseResultsInnerCategoryScores$unlock()
#
## Below is an example to define the print function
# CreateModerationResponseResultsInnerCategoryScores$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponseResultsInnerCategoryScores$lock()


#' Create a new CreateModerationResponseResultsInnerCategoryAppliedInputTypes
#'
#' @description
#' A list of the categories along with the input type(s) that the score applies to.
#'
#' @docType class
#' @title CreateModerationResponseResultsInnerCategoryAppliedInputTypes
#' @description CreateModerationResponseResultsInnerCategoryAppliedInputTypes Class
#' @format An \code{R6Class} generator object
#' @field hate The applied input type(s) for the category 'hate'. list(character)
#' @field hate/threatening The applied input type(s) for the category 'hate/threatening'. list(character)
#' @field harassment The applied input type(s) for the category 'harassment'. list(character)
#' @field harassment/threatening The applied input type(s) for the category 'harassment/threatening'. list(character)
#' @field illicit The applied input type(s) for the category 'illicit'. list(character)
#' @field illicit/violent The applied input type(s) for the category 'illicit/violent'. list(character)
#' @field self-harm The applied input type(s) for the category 'self-harm'. list(character)
#' @field self-harm/intent The applied input type(s) for the category 'self-harm/intent'. list(character)
#' @field self-harm/instructions The applied input type(s) for the category 'self-harm/instructions'. list(character)
#' @field sexual The applied input type(s) for the category 'sexual'. list(character)
#' @field sexual/minors The applied input type(s) for the category 'sexual/minors'. list(character)
#' @field violence The applied input type(s) for the category 'violence'. list(character)
#' @field violence/graphic The applied input type(s) for the category 'violence/graphic'. list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInnerCategoryAppliedInputTypes <- R6::R6Class(
  "CreateModerationResponseResultsInnerCategoryAppliedInputTypes",
  public = list(
    `hate` = NULL,
    `hate/threatening` = NULL,
    `harassment` = NULL,
    `harassment/threatening` = NULL,
    `illicit` = NULL,
    `illicit/violent` = NULL,
    `self-harm` = NULL,
    `self-harm/intent` = NULL,
    `self-harm/instructions` = NULL,
    `sexual` = NULL,
    `sexual/minors` = NULL,
    `violence` = NULL,
    `violence/graphic` = NULL,

    #' @description
    #' Initialize a new CreateModerationResponseResultsInnerCategoryAppliedInputTypes class.
    #'
    #' @param hate The applied input type(s) for the category 'hate'.
    #' @param hate/threatening The applied input type(s) for the category 'hate/threatening'.
    #' @param harassment The applied input type(s) for the category 'harassment'.
    #' @param harassment/threatening The applied input type(s) for the category 'harassment/threatening'.
    #' @param illicit The applied input type(s) for the category 'illicit'.
    #' @param illicit/violent The applied input type(s) for the category 'illicit/violent'.
    #' @param self-harm The applied input type(s) for the category 'self-harm'.
    #' @param self-harm/intent The applied input type(s) for the category 'self-harm/intent'.
    #' @param self-harm/instructions The applied input type(s) for the category 'self-harm/instructions'.
    #' @param sexual The applied input type(s) for the category 'sexual'.
    #' @param sexual/minors The applied input type(s) for the category 'sexual/minors'.
    #' @param violence The applied input type(s) for the category 'violence'.
    #' @param violence/graphic The applied input type(s) for the category 'violence/graphic'.
    #' @param ... Other optional arguments.
    initialize = function(`hate`, `hate/threatening`, `harassment`, `harassment/threatening`, `illicit`, `illicit/violent`, `self-harm`, `self-harm/intent`, `self-harm/instructions`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`, ...) {
      if (!missing(`hate`)) {
        stopifnot(is.vector(`hate`), length(`hate`) != 0)
        sapply(`hate`, function(x) stopifnot(is.character(x)))
        self$`hate` <- `hate`
      }
      if (!missing(`hate/threatening`)) {
        stopifnot(is.vector(`hate/threatening`), length(`hate/threatening`) != 0)
        sapply(`hate/threatening`, function(x) stopifnot(is.character(x)))
        self$`hate/threatening` <- `hate/threatening`
      }
      if (!missing(`harassment`)) {
        stopifnot(is.vector(`harassment`), length(`harassment`) != 0)
        sapply(`harassment`, function(x) stopifnot(is.character(x)))
        self$`harassment` <- `harassment`
      }
      if (!missing(`harassment/threatening`)) {
        stopifnot(is.vector(`harassment/threatening`), length(`harassment/threatening`) != 0)
        sapply(`harassment/threatening`, function(x) stopifnot(is.character(x)))
        self$`harassment/threatening` <- `harassment/threatening`
      }
      if (!missing(`illicit`)) {
        stopifnot(is.vector(`illicit`), length(`illicit`) != 0)
        sapply(`illicit`, function(x) stopifnot(is.character(x)))
        self$`illicit` <- `illicit`
      }
      if (!missing(`illicit/violent`)) {
        stopifnot(is.vector(`illicit/violent`), length(`illicit/violent`) != 0)
        sapply(`illicit/violent`, function(x) stopifnot(is.character(x)))
        self$`illicit/violent` <- `illicit/violent`
      }
      if (!missing(`self-harm`)) {
        stopifnot(is.vector(`self-harm`), length(`self-harm`) != 0)
        sapply(`self-harm`, function(x) stopifnot(is.character(x)))
        self$`self-harm` <- `self-harm`
      }
      if (!missing(`self-harm/intent`)) {
        stopifnot(is.vector(`self-harm/intent`), length(`self-harm/intent`) != 0)
        sapply(`self-harm/intent`, function(x) stopifnot(is.character(x)))
        self$`self-harm/intent` <- `self-harm/intent`
      }
      if (!missing(`self-harm/instructions`)) {
        stopifnot(is.vector(`self-harm/instructions`), length(`self-harm/instructions`) != 0)
        sapply(`self-harm/instructions`, function(x) stopifnot(is.character(x)))
        self$`self-harm/instructions` <- `self-harm/instructions`
      }
      if (!missing(`sexual`)) {
        stopifnot(is.vector(`sexual`), length(`sexual`) != 0)
        sapply(`sexual`, function(x) stopifnot(is.character(x)))
        self$`sexual` <- `sexual`
      }
      if (!missing(`sexual/minors`)) {
        stopifnot(is.vector(`sexual/minors`), length(`sexual/minors`) != 0)
        sapply(`sexual/minors`, function(x) stopifnot(is.character(x)))
        self$`sexual/minors` <- `sexual/minors`
      }
      if (!missing(`violence`)) {
        stopifnot(is.vector(`violence`), length(`violence`) != 0)
        sapply(`violence`, function(x) stopifnot(is.character(x)))
        self$`violence` <- `violence`
      }
      if (!missing(`violence/graphic`)) {
        stopifnot(is.vector(`violence/graphic`), length(`violence/graphic`) != 0)
        sapply(`violence/graphic`, function(x) stopifnot(is.character(x)))
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
    #' @return CreateModerationResponseResultsInnerCategoryAppliedInputTypes as a base R list.
    #' @examples
    #' # convert array of CreateModerationResponseResultsInnerCategoryAppliedInputTypes (x) to a data frame
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
    #' Convert CreateModerationResponseResultsInnerCategoryAppliedInputTypes to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject <- list()
      if (!is.null(self$`hate`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["hate"]] <-
          self$`hate`
      }
      if (!is.null(self$`hate/threatening`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["hate/threatening"]] <-
          self$`hate/threatening`
      }
      if (!is.null(self$`harassment`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["harassment"]] <-
          self$`harassment`
      }
      if (!is.null(self$`harassment/threatening`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["harassment/threatening"]] <-
          self$`harassment/threatening`
      }
      if (!is.null(self$`illicit`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["illicit"]] <-
          self$`illicit`
      }
      if (!is.null(self$`illicit/violent`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["illicit/violent"]] <-
          self$`illicit/violent`
      }
      if (!is.null(self$`self-harm`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["self-harm"]] <-
          self$`self-harm`
      }
      if (!is.null(self$`self-harm/intent`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["self-harm/intent"]] <-
          self$`self-harm/intent`
      }
      if (!is.null(self$`self-harm/instructions`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["self-harm/instructions"]] <-
          self$`self-harm/instructions`
      }
      if (!is.null(self$`sexual`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["sexual"]] <-
          self$`sexual`
      }
      if (!is.null(self$`sexual/minors`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["sexual/minors"]] <-
          self$`sexual/minors`
      }
      if (!is.null(self$`violence`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["violence"]] <-
          self$`violence`
      }
      if (!is.null(self$`violence/graphic`)) {
        CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject[["violence/graphic"]] <-
          self$`violence/graphic`
      }
      return(CreateModerationResponseResultsInnerCategoryAppliedInputTypesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryAppliedInputTypes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategoryAppliedInputTypes
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hate`)) {
        self$`hate` <- ApiClient$new()$deserializeObj(this_object$`hate`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`hate/threatening`)) {
        self$`hate/threatening` <- ApiClient$new()$deserializeObj(this_object$`hate/threatening`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`harassment`)) {
        self$`harassment` <- ApiClient$new()$deserializeObj(this_object$`harassment`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`harassment/threatening`)) {
        self$`harassment/threatening` <- ApiClient$new()$deserializeObj(this_object$`harassment/threatening`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`illicit`)) {
        self$`illicit` <- ApiClient$new()$deserializeObj(this_object$`illicit`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`illicit/violent`)) {
        self$`illicit/violent` <- ApiClient$new()$deserializeObj(this_object$`illicit/violent`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`self-harm`)) {
        self$`self-harm` <- ApiClient$new()$deserializeObj(this_object$`self-harm`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`self-harm/intent`)) {
        self$`self-harm/intent` <- ApiClient$new()$deserializeObj(this_object$`self-harm/intent`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`self-harm/instructions`)) {
        self$`self-harm/instructions` <- ApiClient$new()$deserializeObj(this_object$`self-harm/instructions`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`sexual`)) {
        self$`sexual` <- ApiClient$new()$deserializeObj(this_object$`sexual`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`sexual/minors`)) {
        self$`sexual/minors` <- ApiClient$new()$deserializeObj(this_object$`sexual/minors`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`violence`)) {
        self$`violence` <- ApiClient$new()$deserializeObj(this_object$`violence`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`violence/graphic`)) {
        self$`violence/graphic` <- ApiClient$new()$deserializeObj(this_object$`violence/graphic`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateModerationResponseResultsInnerCategoryAppliedInputTypes in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryAppliedInputTypes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategoryAppliedInputTypes
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hate` <- ApiClient$new()$deserializeObj(this_object$`hate`, "array[character]", loadNamespace("openapi"))
      self$`hate/threatening` <- ApiClient$new()$deserializeObj(this_object$`hate/threatening`, "array[character]", loadNamespace("openapi"))
      self$`harassment` <- ApiClient$new()$deserializeObj(this_object$`harassment`, "array[character]", loadNamespace("openapi"))
      self$`harassment/threatening` <- ApiClient$new()$deserializeObj(this_object$`harassment/threatening`, "array[character]", loadNamespace("openapi"))
      self$`illicit` <- ApiClient$new()$deserializeObj(this_object$`illicit`, "array[character]", loadNamespace("openapi"))
      self$`illicit/violent` <- ApiClient$new()$deserializeObj(this_object$`illicit/violent`, "array[character]", loadNamespace("openapi"))
      self$`self-harm` <- ApiClient$new()$deserializeObj(this_object$`self-harm`, "array[character]", loadNamespace("openapi"))
      self$`self-harm/intent` <- ApiClient$new()$deserializeObj(this_object$`self-harm/intent`, "array[character]", loadNamespace("openapi"))
      self$`self-harm/instructions` <- ApiClient$new()$deserializeObj(this_object$`self-harm/instructions`, "array[character]", loadNamespace("openapi"))
      self$`sexual` <- ApiClient$new()$deserializeObj(this_object$`sexual`, "array[character]", loadNamespace("openapi"))
      self$`sexual/minors` <- ApiClient$new()$deserializeObj(this_object$`sexual/minors`, "array[character]", loadNamespace("openapi"))
      self$`violence` <- ApiClient$new()$deserializeObj(this_object$`violence`, "array[character]", loadNamespace("openapi"))
      self$`violence/graphic` <- ApiClient$new()$deserializeObj(this_object$`violence/graphic`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategoryAppliedInputTypes and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hate`
      if (!is.null(input_json$`hate`)) {
        stopifnot(is.vector(input_json$`hate`), length(input_json$`hate`) != 0)
        tmp <- sapply(input_json$`hate`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `hate` is missing."))
      }
      # check the required field `hate/threatening`
      if (!is.null(input_json$`hate/threatening`)) {
        stopifnot(is.vector(input_json$`hate/threatening`), length(input_json$`hate/threatening`) != 0)
        tmp <- sapply(input_json$`hate/threatening`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `hate/threatening` is missing."))
      }
      # check the required field `harassment`
      if (!is.null(input_json$`harassment`)) {
        stopifnot(is.vector(input_json$`harassment`), length(input_json$`harassment`) != 0)
        tmp <- sapply(input_json$`harassment`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `harassment` is missing."))
      }
      # check the required field `harassment/threatening`
      if (!is.null(input_json$`harassment/threatening`)) {
        stopifnot(is.vector(input_json$`harassment/threatening`), length(input_json$`harassment/threatening`) != 0)
        tmp <- sapply(input_json$`harassment/threatening`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `harassment/threatening` is missing."))
      }
      # check the required field `illicit`
      if (!is.null(input_json$`illicit`)) {
        stopifnot(is.vector(input_json$`illicit`), length(input_json$`illicit`) != 0)
        tmp <- sapply(input_json$`illicit`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `illicit` is missing."))
      }
      # check the required field `illicit/violent`
      if (!is.null(input_json$`illicit/violent`)) {
        stopifnot(is.vector(input_json$`illicit/violent`), length(input_json$`illicit/violent`) != 0)
        tmp <- sapply(input_json$`illicit/violent`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `illicit/violent` is missing."))
      }
      # check the required field `self-harm`
      if (!is.null(input_json$`self-harm`)) {
        stopifnot(is.vector(input_json$`self-harm`), length(input_json$`self-harm`) != 0)
        tmp <- sapply(input_json$`self-harm`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `self-harm` is missing."))
      }
      # check the required field `self-harm/intent`
      if (!is.null(input_json$`self-harm/intent`)) {
        stopifnot(is.vector(input_json$`self-harm/intent`), length(input_json$`self-harm/intent`) != 0)
        tmp <- sapply(input_json$`self-harm/intent`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `self-harm/intent` is missing."))
      }
      # check the required field `self-harm/instructions`
      if (!is.null(input_json$`self-harm/instructions`)) {
        stopifnot(is.vector(input_json$`self-harm/instructions`), length(input_json$`self-harm/instructions`) != 0)
        tmp <- sapply(input_json$`self-harm/instructions`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `self-harm/instructions` is missing."))
      }
      # check the required field `sexual`
      if (!is.null(input_json$`sexual`)) {
        stopifnot(is.vector(input_json$`sexual`), length(input_json$`sexual`) != 0)
        tmp <- sapply(input_json$`sexual`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `sexual` is missing."))
      }
      # check the required field `sexual/minors`
      if (!is.null(input_json$`sexual/minors`)) {
        stopifnot(is.vector(input_json$`sexual/minors`), length(input_json$`sexual/minors`) != 0)
        tmp <- sapply(input_json$`sexual/minors`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `sexual/minors` is missing."))
      }
      # check the required field `violence`
      if (!is.null(input_json$`violence`)) {
        stopifnot(is.vector(input_json$`violence`), length(input_json$`violence`) != 0)
        tmp <- sapply(input_json$`violence`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `violence` is missing."))
      }
      # check the required field `violence/graphic`
      if (!is.null(input_json$`violence/graphic`)) {
        stopifnot(is.vector(input_json$`violence/graphic`), length(input_json$`violence/graphic`) != 0)
        tmp <- sapply(input_json$`violence/graphic`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryAppliedInputTypes: the required field `violence/graphic` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInnerCategoryAppliedInputTypes
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

      # check if the required `illicit` is null
      if (is.null(self$`illicit`)) {
        return(FALSE)
      }

      # check if the required `illicit/violent` is null
      if (is.null(self$`illicit/violent`)) {
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

      # check if the required `illicit` is null
      if (is.null(self$`illicit`)) {
        invalid_fields["illicit"] <- "Non-nullable required field `illicit` cannot be null."
      }

      # check if the required `illicit/violent` is null
      if (is.null(self$`illicit/violent`)) {
        invalid_fields["illicit/violent"] <- "Non-nullable required field `illicit/violent` cannot be null."
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
# CreateModerationResponseResultsInnerCategoryAppliedInputTypes$unlock()
#
## Below is an example to define the print function
# CreateModerationResponseResultsInnerCategoryAppliedInputTypes$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponseResultsInnerCategoryAppliedInputTypes$lock()


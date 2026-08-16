
/*
 * CompletionUsage.h
 *
 * Usage statistics for the completion request.
 */

#ifndef TINY_CPP_CLIENT_CompletionUsage_H_
#define TINY_CPP_CLIENT_CompletionUsage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CompletionUsage_completion_tokens_details.h"
#include "CompletionUsage_prompt_tokens_details.h"

namespace Tiny {


/*! \brief Usage statistics for the completion request.
 *
 *  \ingroup Models
 *
 */

class CompletionUsage{
public:

    /*! \brief Constructor.
	 */
    CompletionUsage();
    CompletionUsage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CompletionUsage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Number of tokens in the generated completion.
	 */
	int getCompletionTokens();

	/*! \brief Set Number of tokens in the generated completion.
	 */
	void setCompletionTokens(int  completion_tokens);
	/*! \brief Get Number of tokens in the prompt.
	 */
	int getPromptTokens();

	/*! \brief Set Number of tokens in the prompt.
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get Total number of tokens used in the request (prompt + completion).
	 */
	int getTotalTokens();

	/*! \brief Set Total number of tokens used in the request (prompt + completion).
	 */
	void setTotalTokens(int  total_tokens);
	/*! \brief Get 
	 */
	CompletionUsage_completion_tokens_details getCompletionTokensDetails();

	/*! \brief Set 
	 */
	void setCompletionTokensDetails(CompletionUsage_completion_tokens_details  completion_tokens_details);
	/*! \brief Get 
	 */
	CompletionUsage_prompt_tokens_details getPromptTokensDetails();

	/*! \brief Set 
	 */
	void setPromptTokensDetails(CompletionUsage_prompt_tokens_details  prompt_tokens_details);


    private:
    int completion_tokens{};
    int prompt_tokens{};
    int total_tokens{};
    CompletionUsage_completion_tokens_details completion_tokens_details;
    CompletionUsage_prompt_tokens_details prompt_tokens_details;
};
}

#endif /* TINY_CPP_CLIENT_CompletionUsage_H_ */

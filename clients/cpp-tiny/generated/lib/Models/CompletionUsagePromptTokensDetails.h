
/*
 * CompletionUsage_prompt_tokens_details.h
 *
 * Breakdown of tokens used in the prompt.
 */

#ifndef TINY_CPP_CLIENT_CompletionUsage_prompt_tokens_details_H_
#define TINY_CPP_CLIENT_CompletionUsage_prompt_tokens_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Breakdown of tokens used in the prompt.
 *
 *  \ingroup Models
 *
 */

class CompletionUsage_prompt_tokens_details{
public:

    /*! \brief Constructor.
	 */
    CompletionUsage_prompt_tokens_details();
    CompletionUsage_prompt_tokens_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CompletionUsage_prompt_tokens_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Audio input tokens present in the prompt.
	 */
	int getAudioTokens();

	/*! \brief Set Audio input tokens present in the prompt.
	 */
	void setAudioTokens(int  audio_tokens);
	/*! \brief Get Cached tokens present in the prompt.
	 */
	int getCachedTokens();

	/*! \brief Set Cached tokens present in the prompt.
	 */
	void setCachedTokens(int  cached_tokens);


    private:
    int audio_tokens{};
    int cached_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_CompletionUsage_prompt_tokens_details_H_ */

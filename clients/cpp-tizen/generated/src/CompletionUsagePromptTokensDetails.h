/*
 * CompletionUsage_prompt_tokens_details.h
 *
 * Breakdown of tokens used in the prompt.
 */

#ifndef _CompletionUsage_prompt_tokens_details_H_
#define _CompletionUsage_prompt_tokens_details_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Breakdown of tokens used in the prompt.
 *
 *  \ingroup Models
 *
 */

class CompletionUsage_prompt_tokens_details : public Object {
public:
	/*! \brief Constructor.
	 */
	CompletionUsage_prompt_tokens_details();
	CompletionUsage_prompt_tokens_details(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CompletionUsage_prompt_tokens_details();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int audio_tokens;
	int cached_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CompletionUsage_prompt_tokens_details_H_ */

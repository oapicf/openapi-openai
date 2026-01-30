/*
 * Static_Chunking_Strategy_static.h
 *
 * 
 */

#ifndef _Static_Chunking_Strategy_static_H_
#define _Static_Chunking_Strategy_static_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Static_Chunking_Strategy_static : public Object {
public:
	/*! \brief Constructor.
	 */
	Static_Chunking_Strategy_static();
	Static_Chunking_Strategy_static(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Static_Chunking_Strategy_static();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
	 */
	int getMaxChunkSizeTokens();

	/*! \brief Set The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
	 */
	void setMaxChunkSizeTokens(int  max_chunk_size_tokens);
	/*! \brief Get The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
	 */
	int getChunkOverlapTokens();

	/*! \brief Set The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
	 */
	void setChunkOverlapTokens(int  chunk_overlap_tokens);

private:
	int max_chunk_size_tokens;
	int chunk_overlap_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Static_Chunking_Strategy_static_H_ */

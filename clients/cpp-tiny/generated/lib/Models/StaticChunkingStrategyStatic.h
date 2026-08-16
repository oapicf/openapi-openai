
/*
 * Static_Chunking_Strategy_static.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Static_Chunking_Strategy_static_H_
#define TINY_CPP_CLIENT_Static_Chunking_Strategy_static_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Static_Chunking_Strategy_static{
public:

    /*! \brief Constructor.
	 */
    Static_Chunking_Strategy_static();
    Static_Chunking_Strategy_static(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Static_Chunking_Strategy_static();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int max_chunk_size_tokens{};
    int chunk_overlap_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_Static_Chunking_Strategy_static_H_ */

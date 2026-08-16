
/*
 * VectorStoreFileObject_chunking_strategy.h
 *
 * The strategy used to chunk the file.
 */

#ifndef TINY_CPP_CLIENT_VectorStoreFileObject_chunking_strategy_H_
#define TINY_CPP_CLIENT_VectorStoreFileObject_chunking_strategy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OtherChunkingStrategyResponseParam.h"
#include "StaticChunkingStrategy.h"
#include "StaticChunkingStrategyResponseParam.h"

namespace Tiny {


/*! \brief The strategy used to chunk the file.
 *
 *  \ingroup Models
 *
 */

class VectorStoreFileObject_chunking_strategy{
public:

    /*! \brief Constructor.
	 */
    VectorStoreFileObject_chunking_strategy();
    VectorStoreFileObject_chunking_strategy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VectorStoreFileObject_chunking_strategy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `static`.
	 */
	std::string getType();

	/*! \brief Set Always `static`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	StaticChunkingStrategy getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(StaticChunkingStrategy  r_static);


    private:
    std::string type{};
    StaticChunkingStrategy r_static;
};
}

#endif /* TINY_CPP_CLIENT_VectorStoreFileObject_chunking_strategy_H_ */

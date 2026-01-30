/*
 * VectorStoreFileObject_chunking_strategy.h
 *
 * The strategy used to chunk the file.
 */

#ifndef _VectorStoreFileObject_chunking_strategy_H_
#define _VectorStoreFileObject_chunking_strategy_H_


#include <string>
#include "OtherChunkingStrategyResponseParam.h"
#include "StaticChunkingStrategy.h"
#include "StaticChunkingStrategyResponseParam.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The strategy used to chunk the file.
 *
 *  \ingroup Models
 *
 */

class VectorStoreFileObject_chunking_strategy : public Object {
public:
	/*! \brief Constructor.
	 */
	VectorStoreFileObject_chunking_strategy();
	VectorStoreFileObject_chunking_strategy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VectorStoreFileObject_chunking_strategy();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	StaticChunkingStrategy r_static;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VectorStoreFileObject_chunking_strategy_H_ */

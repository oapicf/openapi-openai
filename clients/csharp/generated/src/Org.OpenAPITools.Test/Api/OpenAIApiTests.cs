/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing OpenAIApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class OpenAIApiTests : IDisposable
    {
        private OpenAIApi instance;

        public OpenAIApiTests()
        {
            instance = new OpenAIApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of OpenAIApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' OpenAIApi
            //Assert.IsType<OpenAIApi>(instance);
        }

        /// <summary>
        /// Test CancelFineTune
        /// </summary>
        [Fact]
        public void CancelFineTuneTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string fineTuneId = null;
            //var response = instance.CancelFineTune(fineTuneId);
            //Assert.IsType<FineTune>(response);
        }

        /// <summary>
        /// Test CreateChatCompletion
        /// </summary>
        [Fact]
        public void CreateChatCompletionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateChatCompletionRequest createChatCompletionRequest = null;
            //var response = instance.CreateChatCompletion(createChatCompletionRequest);
            //Assert.IsType<CreateChatCompletionResponse>(response);
        }

        /// <summary>
        /// Test CreateCompletion
        /// </summary>
        [Fact]
        public void CreateCompletionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateCompletionRequest createCompletionRequest = null;
            //var response = instance.CreateCompletion(createCompletionRequest);
            //Assert.IsType<CreateCompletionResponse>(response);
        }

        /// <summary>
        /// Test CreateEdit
        /// </summary>
        [Fact]
        public void CreateEditTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateEditRequest createEditRequest = null;
            //var response = instance.CreateEdit(createEditRequest);
            //Assert.IsType<CreateEditResponse>(response);
        }

        /// <summary>
        /// Test CreateEmbedding
        /// </summary>
        [Fact]
        public void CreateEmbeddingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateEmbeddingRequest createEmbeddingRequest = null;
            //var response = instance.CreateEmbedding(createEmbeddingRequest);
            //Assert.IsType<CreateEmbeddingResponse>(response);
        }

        /// <summary>
        /// Test CreateFile
        /// </summary>
        [Fact]
        public void CreateFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream file = null;
            //string purpose = null;
            //var response = instance.CreateFile(file, purpose);
            //Assert.IsType<OpenAIFile>(response);
        }

        /// <summary>
        /// Test CreateFineTune
        /// </summary>
        [Fact]
        public void CreateFineTuneTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateFineTuneRequest createFineTuneRequest = null;
            //var response = instance.CreateFineTune(createFineTuneRequest);
            //Assert.IsType<FineTune>(response);
        }

        /// <summary>
        /// Test CreateImage
        /// </summary>
        [Fact]
        public void CreateImageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateImageRequest createImageRequest = null;
            //var response = instance.CreateImage(createImageRequest);
            //Assert.IsType<ImagesResponse>(response);
        }

        /// <summary>
        /// Test CreateImageEdit
        /// </summary>
        [Fact]
        public void CreateImageEditTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream image = null;
            //string prompt = null;
            //System.IO.Stream? mask = null;
            //int? n = null;
            //string? size = null;
            //string? responseFormat = null;
            //string? user = null;
            //var response = instance.CreateImageEdit(image, prompt, mask, n, size, responseFormat, user);
            //Assert.IsType<ImagesResponse>(response);
        }

        /// <summary>
        /// Test CreateImageVariation
        /// </summary>
        [Fact]
        public void CreateImageVariationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream image = null;
            //int? n = null;
            //string? size = null;
            //string? responseFormat = null;
            //string? user = null;
            //var response = instance.CreateImageVariation(image, n, size, responseFormat, user);
            //Assert.IsType<ImagesResponse>(response);
        }

        /// <summary>
        /// Test CreateModeration
        /// </summary>
        [Fact]
        public void CreateModerationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateModerationRequest createModerationRequest = null;
            //var response = instance.CreateModeration(createModerationRequest);
            //Assert.IsType<CreateModerationResponse>(response);
        }

        /// <summary>
        /// Test CreateTranscription
        /// </summary>
        [Fact]
        public void CreateTranscriptionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream file = null;
            //CreateTranscriptionRequestModel model = null;
            //string? prompt = null;
            //string? responseFormat = null;
            //decimal? temperature = null;
            //string? language = null;
            //var response = instance.CreateTranscription(file, model, prompt, responseFormat, temperature, language);
            //Assert.IsType<CreateTranscriptionResponse>(response);
        }

        /// <summary>
        /// Test CreateTranslation
        /// </summary>
        [Fact]
        public void CreateTranslationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream file = null;
            //CreateTranscriptionRequestModel model = null;
            //string? prompt = null;
            //string? responseFormat = null;
            //decimal? temperature = null;
            //var response = instance.CreateTranslation(file, model, prompt, responseFormat, temperature);
            //Assert.IsType<CreateTranslationResponse>(response);
        }

        /// <summary>
        /// Test DeleteFile
        /// </summary>
        [Fact]
        public void DeleteFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string fileId = null;
            //var response = instance.DeleteFile(fileId);
            //Assert.IsType<DeleteFileResponse>(response);
        }

        /// <summary>
        /// Test DeleteModel
        /// </summary>
        [Fact]
        public void DeleteModelTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string model = null;
            //var response = instance.DeleteModel(model);
            //Assert.IsType<DeleteModelResponse>(response);
        }

        /// <summary>
        /// Test DownloadFile
        /// </summary>
        [Fact]
        public void DownloadFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string fileId = null;
            //var response = instance.DownloadFile(fileId);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test ListFiles
        /// </summary>
        [Fact]
        public void ListFilesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.ListFiles();
            //Assert.IsType<ListFilesResponse>(response);
        }

        /// <summary>
        /// Test ListFineTuneEvents
        /// </summary>
        [Fact]
        public void ListFineTuneEventsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string fineTuneId = null;
            //bool? stream = null;
            //var response = instance.ListFineTuneEvents(fineTuneId, stream);
            //Assert.IsType<ListFineTuneEventsResponse>(response);
        }

        /// <summary>
        /// Test ListFineTunes
        /// </summary>
        [Fact]
        public void ListFineTunesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.ListFineTunes();
            //Assert.IsType<ListFineTunesResponse>(response);
        }

        /// <summary>
        /// Test ListModels
        /// </summary>
        [Fact]
        public void ListModelsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.ListModels();
            //Assert.IsType<ListModelsResponse>(response);
        }

        /// <summary>
        /// Test RetrieveFile
        /// </summary>
        [Fact]
        public void RetrieveFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string fileId = null;
            //var response = instance.RetrieveFile(fileId);
            //Assert.IsType<OpenAIFile>(response);
        }

        /// <summary>
        /// Test RetrieveFineTune
        /// </summary>
        [Fact]
        public void RetrieveFineTuneTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string fineTuneId = null;
            //var response = instance.RetrieveFineTune(fineTuneId);
            //Assert.IsType<FineTune>(response);
        }

        /// <summary>
        /// Test RetrieveModel
        /// </summary>
        [Fact]
        public void RetrieveModelTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string model = null;
            //var response = instance.RetrieveModel(model);
            //Assert.IsType<Model>(response);
        }
    }
}
